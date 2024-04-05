package Focus;

import java.math.BigInteger;

public class FocusMiner {
    public static void main(String[] args) {
        MatrixNode matrix = new MatrixNode(10);

        for (int i = 1; i <= 102; i++) {
            matrix.createNode(BigInteger.valueOf(i));
        }

        Node head;
        for (int each = 0; each < 10; each++) {
            head = matrix.getHead(each);
            head.lerall();
            System.out.println("--------------------");
        }
    }
}
