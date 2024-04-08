package Focus;

import java.math.BigInteger;

import Generic.Generator;

public class Starter {

    public static void main(String[] args) {
        MatrixNode matrix = Loader.load(1);
        System.out.println("Matrix loaded");
        BigInteger gen = Generator.generate();
        System.out.println("Generator loaded");
        gen = BigInteger.valueOf(3952043);
        Sindicato sindicato = new Sindicato(matrix, 1, gen);
        System.out.println("Sindicato loaded");

        sindicato.start();
        
    }
    
}
