
package Miner_v2;
import java.math.BigInteger;

public abstract class Miner extends Thread{

    // classe responsavel por minerar os numeros primos

    private PrimoNode src;
    protected BigInteger gen;
    protected boolean isPrime = true;

    public Miner(PrimoNode src, BigInteger gen) {
        this.src = src;
        this.gen = gen;
    }

    public void run(){
        isPrime = mine();
        // mata a thread
        Thread.currentThread().interrupt();

    }


    public boolean mine() {
        BigInteger meia = gen.divide(BigInteger.valueOf(2));
        PrimoNode pointer = src;
        while(pointer != null && pointer.get().compareTo(meia) <= 0){
            if(gen.remainder(pointer.get()).compareTo(BigInteger.ZERO) == 0){
                isPrime = false;
                break;
            }
            pointer = pointer.next();
        }
        return isPrime;
    }
    
    
    
}