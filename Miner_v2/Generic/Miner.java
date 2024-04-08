
package Generic;
import java.math.BigInteger;

import Focus.Sindicato;

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
        mine();
        // mata a thread
        Sindicato.miners--;
        Thread.currentThread().interrupt();

    }


    public void mine() {
        BigInteger meia = gen.divide(BigInteger.valueOf(2));
        PrimoNode pointer = src;
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
    
    
    
}