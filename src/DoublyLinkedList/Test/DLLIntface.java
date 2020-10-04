package DoublyLinkedList.Test;

public interface DLLIntface {
    public Node getHead();
    public Node getTail();
    public int getLength();
    public void insertAtBegin(int data);
    public void insertAtEnd(int data);
    public void insertAtPosition(int data, int position);
    public void removeAtBegin();
    public void removeAtEnd();
    public void removeAtPosition(int position);
    public void traverseLength();
    public void traverseTail();
}
