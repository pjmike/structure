package com.pjmike.queue;

import com.pjmike.exception.EmptyQueueException;
import com.pjmike.list.ListNode;

/**
 * 用链表实现队列
 *
 * @author pjmike
 * @create 2018-03-11 10:37
 */
public class ListQueue {
    /**
     * 队首指针
     */
    private ListNode frontNode;
    /**
     * 队尾指针
     */
    private ListNode rearNode;

    public ListQueue() {
        this.frontNode = null;
        this.rearNode = null;
    }

    /**
     * 新建队列
     *
     * @return
     */
    public static ListQueue createQueue() {
        return new ListQueue();
    }

    /**
     * 判断是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        if (frontNode == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 入队
     *
     * @param data
     */
    public void enQueue(int data) {
        ListNode newNode = new ListNode();
        if (rearNode != null) {
            rearNode.setNext(newNode);
            rearNode = newNode;
        }
        rearNode = newNode;
        if (frontNode == null) {
            frontNode = newNode;
        }
    }

    /**
     * 出队
     *
     * @return
     */
    public Object outQueue() {
        if (isEmpty()) {
            throw new EmptyQueueException("Queue Empty");
        }
        Object data = frontNode.getData();
        frontNode = frontNode.getNext();
        return data;
    }
}
