package com.pjmike.list;


/**
 * @author pjmike
 * @create 2018-03-08 22:12
 */
public class ListDemo {
    /**
     * 插入结点
     *
     * @param listNode
     * @param site
     */
    public ListNode insertNode(ListNode headNode,ListNode listNode, int site) {
        //判断头结点是否为空
        if (headNode == null) {
            return listNode;
        }
        //计算出链表的长度
        int size = listLength(headNode);
        if (site < 1 || site > size + 1) {
            System.out.println("over the length or the site is illegal");
            return headNode;
        }
        //在表头插入结点
        if (site == 1) {
            listNode.setNext(headNode);
            return listNode;
        } else {
            //定义一个临时变量，保存插入地方的前一个结点
            ListNode previousNode = headNode;
            int count = 1;
            while (count < site - 1) {
                previousNode = previousNode.getNext();
                count++;
            }
            previousNode.setNext(listNode);
            listNode.setNext(previousNode.getNext());
        }
        return headNode;
    }

    /**
     * 删除结点
     *
     * @param headNode
     * @param site
     * @return
     */
    public ListNode removeNode(ListNode headNode, int site) {
        //计算出链表的长度
        int size = listLength(headNode);
        if (site < 1 || site > size + 1) {
            System.out.println("over the length or the site is illegal");
            return headNode;
        }
        //删除头结点
        if (site == 1) {
            ListNode temp = headNode.getNext();
            headNode = null;
            return headNode.getNext();
        } else {
            ListNode temp = headNode;
            int length = 1;
            while (length < site - 1) {
                temp = headNode.getNext();
                length++;
            }
            ListNode afterNode = temp.getNext();
            temp.setNext(afterNode.getNext());
            afterNode = null;
        }
        return headNode;
    }

    /**
     * 查找某一结点
     *
     * @param headNode
     * @param site
     * @return
     */
    public ListNode getNode(ListNode headNode,int site) {
        if (headNode == null) {
            return null;
        }
        int size = listLength(headNode);
        if (site > size || site < 1) {
            System.out.println("over the length or the site is illegal");
            return headNode;
        }
        if (site == 1) {
            return headNode;
        } else {
            ListNode temp = headNode;
            int length = 1;
            while (length < site) {
                temp = temp.getNext();
                length++;
            }
            return temp;
        }
    }
    /**
     *  计算链表的长度
     *
     * @param headNode
     * @return
     */
    public int listLength(ListNode headNode) {
        int length = 0;
        while (headNode.getNext() != null) {
            length++;
            headNode = headNode.getNext();
        }
        return length;
    }
}
