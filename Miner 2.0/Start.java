import java.io.IOException;
import java.math.BigInteger;

public class Start {

    // classe responsável por iniciar o programa e controlar o fluxo de execução

    public static BigInteger atual;
    public static PrimoNode head = null;

    public static void main(String[] args) throws IOException{

        Loader.load();
        

        Miner miner = new Miner();
        
        while(true){
            miner.mine();
        }
    }
}