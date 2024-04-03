package Multi;

import java.math.BigInteger;
import java.util.ArrayList;

import Generic.PrimoNode;

public class BlockNode{

    private ArrayList <PrimoNode> bloco;

    public BlockNode() {
        bloco = new ArrayList<PrimoNode>();
    }

    public void add(PrimoNode node) {
        bloco.add(node);
    }
    
}
