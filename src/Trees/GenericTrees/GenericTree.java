package Trees.GenericTrees;

import java.util.Stack;

public class GenericTree {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40,-1,50,90,-1,100,-1,-1,60,-1,-1,30,70,110,-1,120,-1,-1,80,-1,-1,-1};
//        int[] arr = {10, 20, -1, 30, 50, -1, 60, -1, -1, 40, -1, -1};
        Stack<Node> stack = new Stack<>();
        Node root = null;
        for(int i=0; i< arr.length;i++){
            if (arr[i] == -1){
                stack.pop();
            }else{
                Node temp = new Node(arr[i]);
                if (!stack.isEmpty())
                  stack.peek().subtrees.add(temp);
                else
                    root = temp;
                stack.push(temp);

            }
        }

        display(root);
    }

    public static void display(Node node){
        String str = "";
        str += node.data + "->";
        for (Node subtree: node.subtrees){
            str += subtree.data+ ",";
        }

        System.out.println(str);
        for (Node subtree: node.subtrees){
            display(subtree);
        }
    }


}
