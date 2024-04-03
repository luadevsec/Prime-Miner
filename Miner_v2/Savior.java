import java.io.IOException;
import java.math.BigInteger;

import Generic.PrimoNode;

package Miner_v2;

public class Savior {

    // classe responsavel por salvar os dados 

    public static void save(BigInteger primo) throws IOException{
        Binarydb db = new Binarydb();
        PrimoNode.add(primo);
        db.update(primo);
        

    }

}