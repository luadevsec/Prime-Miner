import java.io.File;
import java.math.BigInteger;

public class Loader {
    // classe responsavel por carregar os dados no inicio do programa

    public static void load() {
        File file = new File("primes_db.bin");
    
        // Verifica se o arquivo não existe
        if (!file.exists()) {
            try {
                // Se não existir, cria um novo arquivo e adiciona os primeiros números primos
                Binarydb db = new Binarydb();
                PrimoNode.add(BigInteger.valueOf(2));
                PrimoNode.add(BigInteger.valueOf(3));
                db.escreverPrimos("primes_db.bin", PrimoNode.head); // Corrigido para passar o caminho do arquivo e a cabeça da lista
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    

}