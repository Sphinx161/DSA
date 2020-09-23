package DoublyLinkedList.Test;

public class DLL {
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
//                    newNode.setNext(temp);
//                    temp.getPrev().setNext(newNode);
//                    newNode.setPrev(temp.getPrev());
//                    temp.setPrev(newNode);
//                    length++;
                }
                else {
                    position = (length-1) - position;
                    for (int i=0; i<position;i++){
                        back = back.getPrev();
                    }
                    x = back;
//                    newNode.setNext(back);
//                    back.getPrev().setNext(newNode);
//                    newNode.setPrev(back.getPrev());
//                    back.setPrev(newNode);
//                    length++;
                }
                newNode.setNext(x);
                x.getPrev().setNext(newNode);
                newNode.setPrev(x.getPrev());
                x.setPrev(newNode);
                length++;


            }
//            else {
//                for (int i=0; i<position; i++){
//                    temp = temp.getNext();
//                }
//                newNode.setNext(temp);
//                temp.getPrev().setNext(newNode);
//                newNode.setPrev(temp.getPrev());
//                temp.setPrev(newNode);
//                length++;
//            }

        }
    }

    public void removeAtBegin(){
        Node temp = head;
        if (temp == null){
            System.out.println("[-] List empty!");
        }
        head = temp.getNext();
        head.setPrev(null);
        temp.setNext(null);
        length--;
    }

    public void removeAtEnd(){
        if (head == null){
            System.out.println("[-] List empty!");
        }
        Node temp = tail;
        tail = temp.getPrev();
        tail.setNext(null);
        temp.setPrev(null);
        length--;
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
