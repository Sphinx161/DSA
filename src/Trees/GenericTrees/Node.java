package Trees.GenericTrees;

import java.util.ArrayList;

public class Node {
    int data;
    ArrayList<Node> subtrees;
    Node(int data){
        this.data = data;
        subtrees = new ArrayList<>();
    }

}

