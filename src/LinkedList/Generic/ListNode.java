package LinkedList.Generic;

import LinkedList.Test.LinkedList;

public class ListNode<T extends Comparable<T>> {
    private T data;
    private ListNode<T> next;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    ListNode(T data){
        this.data = data;
        next = null;
    }
    @Override
    public String toString(){
        return this.data.toString();
    }
}
