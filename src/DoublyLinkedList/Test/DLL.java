package DoublyLinkedList.Test;

public class DLL implements DLLIntface {
    private Node head;
    private Node tail;
    private int length=0;

    DLL(){
        head = tail = null;
        length = 0;
    }

    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public int getLength(){ return length; }

    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = tail = newNode;
        }
        else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        length++;
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null){
            head = tail = newNode;
        }
        else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        length++;
    }

    public void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        Node temp = head;
        Node back = tail;
        Node x = null;
        if (position<0 || position > length){
            System.out.println("Invalid position");
        }
        else {
            if (head == null){
                head = tail = newNode;
                length++;
             }
            else if (position == 0){
                insertAtBegin(data);
            }
            else if (position == length){
                insertAtEnd(data);
            }
            else {
                int len = length/2;
                if (position <= len){
                    for (int i=0;i<position;i++){
                        temp = temp.getNext();
                    }
                    x = temp;
                }
                else {
                    position = (length-1) - position;
                    for (int i=0; i<position;i++){
                        back = back.getPrev();
                    }
                    x = back;
                }
                newNode.setNext(x);
                x.getPrev().setNext(newNode);
                newNode.setPrev(x.getPrev());
                x.setPrev(newNode);
                length++;


            }
        }
    }

    public void removeAtBegin(){
        Node temp = head;
        if (temp == null){
            System.out.println("[-] List empty!");
        }
        else if (length == 1){
            head = tail = null;
            length--;
        }else {
            head = temp.getNext();
            head.setPrev(null);
            temp = null;
            length--;
        }

    }

    public void removeAtEnd(){
        if (head == null){
            System.out.println("[-] List empty!");
        }else {
            if (length == 1) {
                head = tail = null;
            }else {
                tail = tail.getPrev();
                tail.setNext(null);
            }
            length--;
        }

    }

    public void removeAtPosition(int position){
        if (position<0 || position >= length){
            System.out.println("Invalid position or position = length");
        }
        else if (head == null){
            System.out.println("List empty");
        }else {
             if (position == 0){
                removeAtBegin();
            }
            else if (position == length-1){
                removeAtEnd();
            }
            else {
                 Node x = null;
                 Node temp = head;
                 Node back = tail;
                 int len = length/2;
                 if (position <= len){
                     for (int i=0;i<position;i++){
                         temp = temp.getNext();
                     }
                     x = temp;
                 }
                 else {
                     position = (length-1) - position;
                     for (int i=0; i<position;i++){
                         back = back.getPrev();
                     }
                     x = back;
                 }

                x.getPrev().setNext(x.getNext());
                x.getNext().setPrev(x.getPrev());
                temp = null;
                 length--;
            }

        }
    }

    public void traverseLength(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
        System.out.println("NULL");
        System.out.println("Length: " + length);
    }

    public void traverseTail(){
        Node temp = tail;
        System.out.print("NULL<-");
        while (temp != null){
            System.out.print(temp.getData() + "<-");
            temp = temp.getPrev();
        }
        System.out.println("");
    }
}
