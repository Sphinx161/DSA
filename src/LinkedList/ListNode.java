package LinkedList;

import LinkedList.Test.LinkedList;

public class ListNode {
    private int data;
    private ListNode next;

    ListNode(int data){
        this.data = data;
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
