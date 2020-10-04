package DoublyLinkedList.Generic;

import DoublyLinkedList.Test.Node;

public class DLL<T extends Comparable<T>> implements DLLIntface{
    private DoublyLinkedList.Test.Node head;
    private Node tail;
    private int length=0;

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void insertAtBegin(int data) {

    }

    @Override
    public void insertAtEnd(int data) {

    }

    @Override
    public void insertAtPosition(int data, int position) {

    }

    @Override
    public void removeAtBegin() {

    }

    @Override
    public void removeAtEnd() {

    }

    @Override
    public void removeAtPosition(int position) {

    }

    @Override
    public void traverseLength() {

    }

    @Override
    public void traverseTail() {

    }

    @Override
    public Node getHead() {
        return head;
    }

    @Override
    public Node getTail() {
        return tail;
    }


}
