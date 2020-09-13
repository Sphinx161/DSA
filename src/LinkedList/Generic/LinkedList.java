package LinkedList.Generic;

public class LinkedList<T extends Comparable<T>> implements ListNodeIntface<T> {
    private ListNode<T> head;
    private int length=0;

    LinkedList(){
        length= 0;
    }

    @Override
    public synchronized void insertAtBeginning(T data) {
        ListNode<T> newNode = new ListNode<>(data);
        newNode.setNext(head);
        head = newNode;
        length++;
        System.out.println("[" +data + " inserted at Beginning]");
    }

    @Override
    public synchronized void insertATEnd(T data) {

        ListNode<T> p = head;
        ListNode<T> q = new ListNode<>(data);
        if (p==null){
            head = q;
        }
        else {
            while (p.getNext() != null){
                p = p.getNext();
            }
            p.setNext(q);
        }
        System.out.println("[" + data + " inserted at End]");
    }

    @Override
    public synchronized void insertATPosition(T data, int position) {
        if (position < 0) position = 0;

        if (position > length) position = length;

        if (head ==null) {
            head = new ListNode<>(data);
        }
        else if (position == 0){
            ListNode<T> q = new ListNode<>(data);
            q.setNext(head);
            head = q;
        }
        else {
            ListNode<T> p = head;
            ListNode<T> q = new ListNode<>(data);
            for (int i = 0; i < position - 1; i++) {
                    p = p.getNext();
            }
            q.setNext(p.getNext());
            p.setNext(q);

            }


        }


    @Override
    public synchronized void removeAtBeginning() {
        ListNode<T> temp = head;
        if (temp == null){
            System.out.println("List empty!");
        }
        System.out.println("[" + head + " removed]");
        head = temp.getNext();
        temp.setNext(null);

    }

    @Override
    public synchronized void removeATEnd() {
        ListNode<T> p = head;
        ListNode<T> q = null;
        if (p != null){
            while (p.getNext() != null){
                q = p;
                p = p.getNext();
            }
        }
        System.out.println("[" + p +" removed]");
        q.setNext(null);

    }

    @Override
    public synchronized void removeAtATPosition(int position) {
        if (position < 0){
            position = 0;
        }
        if (position >= length){
            position = length-1;
        }
        if (head == null){
            System.out.println("List empty!");
        }
        else if (position == 0){
            head = head.getNext();
        }
        else {

            ListNode<T> temp = head;
            for (int i=0 ; i< position-1; i++){
                temp = temp.getNext();
            }
           temp.setNext(temp.getNext().getNext());
//            System.out.println(temp.getNext() + "removed at position");
        }

    }

    @Override
    public synchronized int traverseLength() {
        length=0;

        if (head == null){
            System.out.println("List Empty");
            return 0;
        }
        ListNode<T> p = head;
        while (p!=null){
            System.out.print(p.getData() + "--> ");
            p = p.getNext();
            length++;
            }
        System.out.print("NULL");
        System.out.println("");
        System.out.println("Length: " + length);
        return length;
    }
}
