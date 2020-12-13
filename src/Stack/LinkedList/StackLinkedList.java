package Stack.LinkedList;

import Stack.LinkedList.Node;

public class StackLinkedList {
    Node top;

    StackLinkedList(){
        top = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if (top != null) {
            newNode.setNext(top);
        }
        top = newNode;
    }

    public void pop(){
        if (top == null)
            System.out.println("List empty");
        else
            top = top.getNext();
    }

    public void peek(){
        if (top != null)
            System.out.println(top.data);
        else
            System.out.println("List empty");
    }

    public void show(){
        if (top!=null){
            Node temp = top;
            while (temp!=null){
                System.out.print( temp.data + " ");
                temp = temp.getNext();
            }
            System.out.println("");
        }else {
            System.out.println("List empty");
        }
    }

}
