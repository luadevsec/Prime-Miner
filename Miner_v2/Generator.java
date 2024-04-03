import java.math.BigInteger;

public class Generator {
    // classe responsavel por gerar os numeros primos
    private static final BigInteger TWO = new BigInteger("2");

    public static BigInteger generate() {
        BigInteger tryPrimo = Start.atual.add(TWO);
        Start.atual = tryPrimo;
        return tryPrimo;
    }
}