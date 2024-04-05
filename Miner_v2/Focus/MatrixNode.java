package Focus;

import java.math.BigInteger;

public class MatrixNode {
    private long HEADLIMIT;
    private static Node universalHead = null;
    private static Node universalTail = null;
    private static Node auxiliarTail = null;

    private long cont = 1;

    private Node pointer = universalHead;


    public MatrixNode(long HEADLIMIT) {
        this.HEADLIMIT = HEADLIMIT;
    }

    public void createNode(BigInteger value) {
        if (universalHead == null) {
            universalHead = new Node(value);
            universalTail = universalHead;
            pointer = universalHead;
        } else {
            if (cont < HEADLIMIT) {
                Node target = new Node(value);
                pointer.head(target);
                if (auxiliarTail != null) {
                    auxiliarTail.head().next(target);
                    auxiliarTail = auxiliarTail.head();
                }
                pointer = pointer.head();
                cont++;
                
            } else {
                cont = 1;
                universalTail.next(new Node(value));
                auxiliarTail = universalTail;
                universalTail = universalTail.next();
                pointer = universalTail;
            }
        }
    }

    public Node getHead(long index) {
        Node point = universalHead;
        for (int i = 0; i < index; i++) {
            point = point.head();
        }
        return point;
    }


}


