package Focus;

import java.math.BigInteger;

public class Node {
    private BigInteger value;
    private Node next;
    private Node head;



    public Node(BigInteger value) {
        this.value = value;
        this.next = null;
        this.head = this;
    }

    public BigInteger get() {
        return this.value;
    }

    public Node next() {
        return this.next;
    }
    public Node head() {
        return this.head;
    }
    public void next(Node next) {
        this.next = next;
    }
    public void head(Node head) {
        this.head = head;
    }


    public void lerall() {
        Node point = this;
        while (point != null) {
            System.out.println(point.get());
            point = point.next();
        }
    }
    
}
