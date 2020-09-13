package LinkedList.Generic;

public interface ListNodeIntface<T> {
    public void insertAtBeginning(T data);
    public void insertATEnd(T data);
    public void insertATPosition(T data,int position);
    public void removeAtBeginning();
    public void removeATEnd();
    public void removeAtATPosition(int position);
    public int traverseLength();

}
