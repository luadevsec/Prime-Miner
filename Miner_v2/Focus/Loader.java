package Focus;


import Generic.Binarydb;
import Generic.Generator;

public class Loader {
    
    public static MatrixNode load(long threads) {
        MatrixNode matrix = new MatrixNode(threads);
        Binarydb db = new Binarydb();

        Generator.atulaizar(db.carregarPrimos(matrix));



        return matrix;
    }
}
