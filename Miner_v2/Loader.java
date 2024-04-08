import java.io.File;
import java.math.BigInteger;

import Generic.Binarydb;
import Generic.PrimoNode;



public class Loader {
    // classe responsavel por carregar os dados no inicio do programa

    public static void load() {
        File file = new File("primes_db.bin");
    
        // Verifica se o arquivo não existe
        if (!file.exists()) {
            try {
                Start.head = PrimoNode.head(new PrimoNode(new BigInteger("2")));
                Savior.save(BigInteger.valueOf(3));
                Start.atual = BigInteger.valueOf(3);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            Binarydb db = new Binarydb();
            Start.head = PrimoNode.head(new PrimoNode(new BigInteger("2")));
            db.carregarPrimos(Start.head);
            Start.atual = PrimoNode.ultimo.get();
        }
    }
    

}