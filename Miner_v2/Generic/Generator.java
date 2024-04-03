package Generic;
import java.math.BigInteger;


public class Generator {
    // classe responsavel por gerar os numeros primos
    private static final BigInteger TWO = new BigInteger("2");
    private static BigInteger atual;

    public static BigInteger generate() {
        atual = atual.add(TWO);
        return atual;
    }

    public static void atulaizar(BigInteger atual) {
        Generator.atual = atual;
    }
}