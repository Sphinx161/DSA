package LinkedList.Generic;

public class App{
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<Integer>();
//        l.traverseLength();
//        l.insertAtBeginning(30);
//        l.insertAtBeginning(34);
//        l.traverseLength();
//        l.insertATEnd(52);
//        l.insertATEnd(578);
//        l.traverseLength();
//        l.insertATPosition(44,0);
//        l.insertATPosition(48,0);
//        l.traverseLength();
//        l.removeAtBeginning();
//        l.traverseLength();
//        l.removeATEnd();
//        l.traverseLength();
        for (int i=0 ;i <6;i++){
            l.insertATEnd(i+10);
        }
        l.traverseLength();
        l.removeAtATPosition(9);
        l.traverseLength();
//        l.removeAtATPosition(2);
//        l.removeAtATPosition(3);

//        l.traverseLength();


    }

}
