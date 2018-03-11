package com.pjmike.stack;

import com.pjmike.list.ListNode;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.EmptyStackException;


/**
 * 用链表实现栈,出栈和入栈都对头结点进行操作
 * <p>
 * 栈的主要操作:
 * 1.void push(int data)：将data数据插入栈
 * 2.int pop():删除并返回一个最后插入的元素
 * <p>
 * 栈的辅助操作:
 * 1.int top()：取栈顶元素，但不删除
 * 2.int size()：返回存储在栈的个数
 * 3.boolean isEmpty()：判断栈中是否有元素
 * 4.boolean isStackFull()：判断栈中是否存满元素，用链表实现栈就不用考虑这个问题
 * <p>
 * 注意:试图对一个空栈或者满栈进行pop或push操作，将会抛出异常。
 *
 * @author pjmike
 * @create 2018-03-10 10:41
 */
public class StackByList {
    private ListNode headNode;

    /**
     * 入栈
     *
     * @param headNode
     * @param data
     * @return
     */
    public void push(ListNode headNode, int data) {
        if (headNode == null) {
            headNode = new ListNode(data);
        } else if (headNode.getData() == null) {
            headNode.setData(data);
        } else {
            ListNode node = new ListNode(data);
            node.setNext(headNode);
            headNode = node;
        }
    }

    /**
     * 出栈
     *
     * @return
     */
    public Object pop() {
        if (headNode == null) {
            //栈为空，不能pop
            throw new EmptyStackException();
        } else {
            Object data = headNode.getData();
            headNode = headNode.getNext();
            return data;
        }
    }

    /**
     * 取栈顶元素
     *
     * @return
     */
    public Object top() {
        if (headNode == null) {
            return null;
        } else {
            return headNode.getData();
        }
    }

    /**
     * @return
     */
    public boolean isEmpty() {
        if (headNode == null) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 删除栈
     */
    public void deleteStack() {
        headNode = null;
    }

    /**
     * 计算栈的长度
     *
     * @param headNode
     * @return
     */
    public int getStackLength(ListNode headNode) {
        int length = 0;
        ListNode temp = headNode;
        while (temp != null) {
            length++;
            temp = temp.getNext();
        }
        return length;
    }
}
