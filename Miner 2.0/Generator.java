import java.math.BigInteger;

public class Generator {
    // classe responsavel por gerar os numeros primos
    private static final BigInteger TWO = new BigInteger("2");

    public static BigInteger generate() {
        BigInteger primo = Start.atual;
        Start.atual = Start.atual.add(TWO);
        return primo;
    }
}