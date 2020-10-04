package DoublyLinkedList.Generic;

public class Node<T extends Comparable<T>> {
    T data;
    Node prev;
    Node next;

    Node(T data){
        this.data = data;
        prev = null;
        next = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
