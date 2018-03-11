package com.pjmike.list;

/**
 * 单链表
 *
 * @author pjmike
 * @create 2018-03-08 21:42
 */
public class ListNode {
    private Object data;
    private ListNode next;

    public ListNode(int data) {
        this.data = data;
    }

    public ListNode() {
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
