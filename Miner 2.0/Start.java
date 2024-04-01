import java.io.IOException;
import java.math.BigInteger;

public class Start {

    // classe responsável por iniciar o programa e controlar o fluxo de execução

    public static BigInteger atual;
    public static PrimoNode head = null;

    public static void main(String[] args) throws IOException{

        Loader.load();
        
        int bilion = 1000000000;

        Miner miner = new Miner();
        while(atual.compareTo(BigInteger.valueOf(bilion)) < 0){
            miner.mine();
        }
    }
}