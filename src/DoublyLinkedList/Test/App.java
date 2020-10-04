package DoublyLinkedList.Test;

public class App {
    public static void main(String[] args) {
        DLL x = new DLL();
//        x.insertAtEnd(50);
//        x.insertAtEnd(60);
//        x.traverseLength();


//        x.insertAtBegin(70);
//        x.insertAtBegin(60);
//        x.insertAtBegin(50);
//        x.insertAtBegin(40);
//        x.insertAtBegin(30);
//        x.insertAtBegin(20);
//        x.insertAtBegin(10);
        x.traverseLength();
//        x.traverseTail();
//        System.out.println("Head: "  + x.getHead().getData());
//        System.out.println("Tail: "  + x.getTail().getData());
//        System.out.println("removing");
//        x.removeAtBegin();
//        x.removeAtEnd();
//        x.traverseLength();
//        x.traverseTail();
//        System.out.println("Head: "  + x.getHead().getData());
//        System.out.println("Tail: "  + x.getTail().getData());

//
//        x.insertAtEnd(50);
//        x.insertAtEnd(60);
//        x.traverseLength();
//        x.getHead();
//        x.getTail();
//        x.traverseTail();
//        x.insertAtBegin(1);
//        x.traverseLength();
//        System.out.println("Head: "  + x.getHead().getData());
//        System.out.println("Tail: "  + x.getTail().getData());
//
//
//        x.insertAtEnd(22);
//        x.traverseLength();
//        System.out.println("Head: "  + x.getHead().getData());
//        System.out.println("Tail: "  + x.getTail().getData());
//        x.traverseTail();

//        x.insertAtPosition(66,6);
//        x.traverseLength();
//        System.out.println("Head: "  + x.getHead().getData());
//        System.out.println("Tail: "  + x.getTail().getData());
//        x.traverseTail();
//        x.removeAtEnd();
        x.insertAtPosition(0,0);
        System.out.println("Head: "  + x.getHead().getData());
        System.out.println("Tail: "  + x.getTail().getData());
        x.traverseLength();
        x.traverseTail();

    }

}
