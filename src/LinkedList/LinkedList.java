package LinkedList;

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("[1] Insert at the Beginning");
        System.out.println("[2] Insert at the End");
        System.out.println("[3] Insert at a position");
        System.out.println("[4] Remove at the Begin");
        System.out.println("[5] Remove at the End");
        System.out.println("[6] Remove at a position");
        System.out.println("[7] Length");
        System.out.println("[8] Exit");

        int flag = 1;
        while (flag == 1){
            System.out.println("Enter your choice[]:");

            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter data");
                    int beginData = scanner.nextInt();
                    l.insertBegin(beginData);
                    break;
                case 2:
                    System.out.println("Enter data");
                    int endData = scanner.nextInt();
                    l.insertEnd(endData);
                    break;
                case 3:
                    System.out.println("Enter data");
                    System.out.println("Enter position");
                    int data = scanner.nextInt();
                    int position = scanner.nextInt();
                    l.insertAt(data,position);
                    break;
                case 4:
                    l.removeBegin();
                    break;
                case 5:
                    l.removeEnd();
                    break;
                case 6:
                    System.out.println("Enter Position");
                    int remPosition = scanner.nextInt();
                    l.removeAt(remPosition);
                    break;
                case 7:
                    l.traverseLength(l.head);
                    break;
                case 8:
                    flag = 0;
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        }


    }
    ListNode head;
    private int length=0;

    public LinkedList(){
        length=0;
    }

    public synchronized int traverseLength(ListNode head){
        length =0;
        if (head == null){
            System.out.println("List Empty");
            return 0;
        }
        ListNode currentNode = head;
        while (currentNode!= null){
            System.out.println(currentNode.getData());
            length++;
            currentNode = currentNode.getNext();

        }
        return length;

    }
    public synchronized void insertBegin(int data){
        ListNode newNode = new ListNode(data);
        newNode.setNext(head);
        head = newNode;
        length++;
        System.out.println("InsertedBegin: " + data);
    }


    public synchronized void insertEnd(int data){
        ListNode p,q;
        p = head;
        q = new ListNode(data);
        if(p == null){
            head = q;
        }
        else {
            while (p.getNext()!=null){
                p = p.getNext();
            }
            p.setNext(q);
        }
        length++;
    }

    public synchronized void insertAt(int data, int position){
        ListNode temp= head;
        for (int i=0; i< (position-1); i++){
            temp = temp.getNext();
        }
        ListNode newNode = new ListNode(data);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
    }

    public synchronized void removeBegin(){
        ListNode p = head;
        if (p!= null){
            head = p.getNext();
//            p.setNext(null);
            length--;
        }
        else {
            System.out.println("List empty!");
        }

    }

    public synchronized void removeEnd(){
        ListNode p = head;
        ListNode q= null;
        if (p==null){
            System.out.println("List empty!");
        }
        while (p.getNext() != null){

            q = p;
            p = p.getNext();
        }
        q.setNext(null);

    }
    public synchronized void removeAt(int position){
        ListNode temp = head;
        ListNode p=null;
        if (head == null){
            System.out.println("List empty!");
        }
        for (int i=0 ; i<(position); i++){
            p = temp;
            temp = temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(null);

    }
}
