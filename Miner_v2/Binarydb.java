import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;

import Generic.PrimoNode;

public class Binarydb {

    private final String filePath = "primes_db.bin";

    public void escreverPrimos(PrimoNode head) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {

            PrimoNode current = head;
            while (current != null) {
                dos.writeUTF(current.get().toString()); // Escreve o inteiro no arquivo
                current = current.next(); // Move para o próximo nó
            }
        }
    }
    public void update(BigInteger primo) throws IOException {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath, true))) {
            dos.writeUTF(primo.toString()); // Escreve o inteiro no arquivo
        }
    }

    public void carregarPrimos(PrimoNode head){
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (dis.available() > 0) {
                BigInteger primo = new BigInteger(dis.readUTF());
                PrimoNode.add(primo);
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar os primos do arquivo");
        }
        
    }
    
}
