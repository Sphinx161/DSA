package Queue;

public class QueueLL<T extends Comparable<T>> implements NodeInterface<T>  {
    private Node<T> top = null;
    private Node<T> rear = null;
    private int length = 0;

    @Override
    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        if (top == null){
            top = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = rear.getNext();
        }
        length++;
    }

    @Override
    public void pop() {
        if (top == null)
            System.out.println("Empty!");
        else
            top = top.getNext();
            if(top == null)
                rear = null;
        length--;
    }

    @Override
    public void peek() {
        if (top == null)
            System.out.println("Empty!");
        else
            System.out.println("Top: " + top.getData());
    }

    @Override
    public void show() {
        if (top == null){
            System.out.println("Empty!");
        }else{
            Node<T> temp = top;
            while(temp != null){
                System.out.print(temp.getData() + "-");
                temp = temp.getNext();
            }
            System.out.println(" ");
        }
    }

    @Override
    public void length() {
        System.out.println("Length: " + length);

    }

    public static void main(String[] args) {
        QueueLL<Integer> queueLL = new QueueLL<>();
        queueLL.push(1);
        queueLL.push(2);
        queueLL.push(3);
        queueLL.pop();
        queueLL.pop();
        queueLL.pop();
        queueLL.length();
        queueLL.push(4);
        queueLL.pop();
        queueLL.show();
        queueLL.length();


//        QueueLL<String> queue = new QueueLL<>();
//        queue.push("a");
//        queue.push("b");
//        queue.push("c");
//        queue.show();
//        queue.pop();
//        queue.length();
//        queue.show();


    }
}


