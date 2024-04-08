package Focus;

import java.math.BigInteger;

// o sidicato é uma classe que representa um sindicato dos mineradores, é o maestro que gerencia os mineradores então vou chamar de sindicato


public class Sindicato {

    public static boolean isPrime = true;
    public static long miners;
    private MatrixNode src;
    private long threds;
    private BigInteger gen;
    
    public Sindicato(MatrixNode src, long threds, BigInteger gen) {
        // construtor
       
        this.src = src;
        this.threds = threds;
        this.gen = gen;


    }

    public void start() {
        // inicia o sindicato
        for (int i = 0; i < threds; i++) {
            miners++;
            Node head = src.getHead(i);
            FocusMiner miner = new FocusMiner(head, gen);
            miner.start();
            System.out.println("Minerador "+i+" iniciado");
        }
        
        do {
            System.out.println("Mineradores ativos: "+miners);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (miners > 0);

        System.out.println("O numero "+gen+" é primo? "+isPrime);
    }

}
