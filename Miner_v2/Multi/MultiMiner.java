package Multi;
import java.math.BigInteger;

import Miner_v2.Miner;
import Miner_v2.PrimoNode;

public class MultiMiner extends Miner{

    public MultiMiner(PrimoNode src, BigInteger gen) {
        super(src, gen);
    }

    public void run(){
        super.isPrime = mine();
        
            System.out.println(super.gen);
        
    }
    
    
}
