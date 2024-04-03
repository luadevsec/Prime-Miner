import java.io.IOException;
import java.math.BigInteger;

public class Miner {

    // classe responsavel por minerar os numeros primos

    private PrimoNode pointer;


    public boolean mine(PrimoNode src, BigInteger gen) {
        BigInteger meia = gen.divide(BigInteger.valueOf(2));
        boolean isPrime = true;
        pointer = src;
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