import java.math.BigInteger;

public class Start {

    // classe responsável por iniciar o programa e controlar o fluxo de execução

    public static BigInteger atual;

    public static void main(String[] args){

        Loader.load();
        for (int i = 0; i < 10; i++) System.out.println(Generator.generate());
    }
}