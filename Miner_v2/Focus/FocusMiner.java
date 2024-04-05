package Focus;

import java.math.BigInteger;

public class FocusMiner {
    public static void main(String[] args) {
        final long HEADLIMIT = 20   ;

        MatrixNode matrix = new MatrixNode(HEADLIMIT);

        for (int i = 1; i <= 750; i++) {
            matrix.createNode(BigInteger.valueOf(i));
        }

        Node head;
        for (int each = 0; each < HEADLIMIT; each++) {
            head = matrix.getHead(each);
            head.lerall();
            System.out.println("\n ------------------------------------");
        }
    }
}
