package CircularLinkedList;

public class CLL implements CLLIntface {
    private Node head;
    private int length=0;

    @Override
    public void getLength(){
       return length;
    }
    
    public void getHead(){
        return head;
    }

    @Override
    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            head.setNext(newNode);
        }else {
            Node currentNode = head;
            while (currentNode.getNext() != head){
                currentNode = currentNode.getNext();
            }
            newNode.setNext(head);
            currentNode.setNext(newNode);
        }
        length++;

    }

    @Override
    public void removeEnd() {
        if (head == null){
            System.out.println("[-] List empty!");
        }
        else {
            Node current = head;
            Node prev = null;

            if(head.getNext() == head) {
                head = null;
                System.out.println("i m here in if");
                System.out.println("if length if" + length);
            }
            else {
                while (current.getNext() != head) {
                    prev = current;
                    current = current.getNext();
                }
                prev.setNext(head);
                current = null;
            }
            System.out.println("above lenth");
            length--;
            System.out.println("length after" + length);

        }
    }

    @Override
    public void removeBegin() {
        if (head == null){
            System.out.println("[-] List Empty");
        }
        else {
            if (head.getNext() == head){
                head = null;
            }
            else {
                Node current = head;
                while (current.getNext() != head){
                    current = current.getNext();
                }
                current.setNext(head.getNext());
                head = head.getNext();
            }
            length--;
        }
    }

    @Override
    public void insertBegin(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            newNode.setNext(head);
        }else {
            newNode.setNext(head);
            Node currentNode = head;
            while (currentNode.getNext() != head){
                currentNode = currentNode.getNext();
            }
            head = newNode;
            currentNode.setNext(head);
        }
        length++;
    }

    @Override
    public void traverseLength() {
        System.out.println("Length: " + length);
        if (head == null){
            System.out.println("List Empty!");
        } else {
            System.out.print(head.getData() + "->");
            Node currentNode = head.getNext();
            while (currentNode != head){
                System.out.print(currentNode.getData() + "->");
                currentNode = currentNode.getNext();
            }
            System.out.println(" ");
        }
    }
}
