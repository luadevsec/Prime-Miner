package Focus;

import java.math.BigInteger;

public class FocusMiner extends Thread{
    private Node src;
    protected BigInteger gen;
    protected boolean isPrime = true;

    public FocusMiner(Node src, BigInteger gen) {
        this.src = src;
        this.gen = gen;
    }

    public void run(){
        mine();
        // mata a thread
        Sindicato.miners--;
        Thread.currentThread().interrupt();

    }


    public void mine() {
        BigInteger meia = gen.divide(BigInteger.valueOf(2));
        Node pointer = src;
        while(Sindicato.isPrime){
            while(Sindicato.isPrime && pointer != null && pointer.get().compareTo(meia) <= 0){
                if(gen.remainder(pointer.get()).compareTo(BigInteger.ZERO) == 0){
                    validate();
                    break;
                }
                pointer = pointer.next();
            }
        }
    }

    public void validate(){
        Sindicato.isPrime = false;
    }
    
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
