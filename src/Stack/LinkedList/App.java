package Stack.LinkedList;

public class App {
    public static void main(String[] args) {
        StackLinkedList list = new StackLinkedList();
        list.show();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);
        list.show();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();
        list.pop();


        list.show();

    }
}
