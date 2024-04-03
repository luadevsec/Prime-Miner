import java.math.BigInteger;

public class PrimoNode {

    // classe responsavel por criar e gerenciar uma lista encadeanda de numeros primos

    private PrimoNode proximo;
    public static PrimoNode ultimo;
    private BigInteger primo;
    
    public PrimoNode(BigInteger primo){
        this.primo = primo;
    }

    public static void add(BigInteger primo){
        PrimoNode novo = new PrimoNode(primo);
        if(ultimo == null){
            ultimo = novo;
        }else{
            ultimo.proximo = novo;
            ultimo = novo;
        }
    }

    public PrimoNode next(){
        return proximo;
    }

    public static PrimoNode head(PrimoNode node){
        ultimo = node;
        return node;
    }

    public BigInteger get(){
        return primo;
    }

    public void printall(){
        PrimoNode atual = this;
        while(atual != null){
            System.out.println(atual.primo);
            atual = atual.proximo;
        }
    }


}