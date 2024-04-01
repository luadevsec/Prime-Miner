import java.math.BigInteger;

public class Loader {
    // classe responsavel por carregar os dados no inicio do programa

    public static void load(){
        PrimoNode node = new PrimoNode(BigInteger.valueOf(2));
        Start.head = PrimoNode.head(node);
        PrimoNode.add(BigInteger.valueOf(3));
        Start.atual = PrimoNode.ultimo.get();
    }

}