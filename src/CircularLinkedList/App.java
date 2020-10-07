package CircularLinkedList;

public class App {
    public static void main(String[] args) {
        CLL x = new CLL();
        x.traverseLength();
        for (int i=1; i<=3; i++){
            x.insertBegin(i*10);
        }
        x.traverseLength();
        x.insertEnd(90);
        x.removeBegin();
        x.getLength();
        x.removeEnd();
        x.traverseLength();

    }

}
