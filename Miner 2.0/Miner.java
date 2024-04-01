import java.io.IOException;
import java.math.BigInteger;

public class Miner {

    // classe responsavel por minerar os numeros primos

    private PrimoNode pointer = Start.head;

    public void mine() throws IOException{
        BigInteger gen = Generator.generate();
        BigInteger meia = gen.divide(BigInteger.valueOf(2));
    
        boolean isPrime = true;
        pointer = Start.head; // Reinicialize o ponteiro para o início da lista a cada chamada de mine
        while(pointer != null && pointer.get().compareTo(meia) <= 0){
            if(gen.remainder(pointer.get()).compareTo(BigInteger.ZERO) == 0){
                isPrime = false;
                break;
            }
            pointer = pointer.next(); // Atualize o ponteiro para o próximo nó
        }
    
        if(isPrime){
            Savior.save(gen);
        }
    }
    
    
    
}