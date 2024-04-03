import java.io.IOException;
import java.math.BigInteger;

import Multi.MultiMiner;

public class Start {

    // classe responsável por iniciar o programa e controlar o fluxo de execução

    public static BigInteger atual;
    public static PrimoNode head = null;

    public static void main(String[] args) throws IOException{

        Loader.load();
        

        Miner miner = new MultiMiner(head, Generator.generate());
        Miner miner2 = new MultiMiner(head, Generator.generate());
        Miner miner3 = new MultiMiner(head, Generator.generate());
        Miner miner4 = new MultiMiner(head, Generator.generate());
        Miner miner5 = new MultiMiner(head, Generator.generate());
        Miner miner6 = new MultiMiner(head, Generator.generate());
        Miner miner7 = new MultiMiner(head, Generator.generate());
        Miner miner8 = new MultiMiner(head, Generator.generate());
        Miner miner9 = new MultiMiner(head, Generator.generate());
        Miner miner10 = new MultiMiner(head, Generator.generate());

        
        
            miner.run();
            miner2.run();
            miner3.run();
            miner4.run();
            miner5.run();
            miner6.run();
            miner7.run();
            miner8.run();
            miner9.run();
            miner10.run();
            
        
    }
}