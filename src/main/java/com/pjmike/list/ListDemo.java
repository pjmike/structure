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
     * 找到链表的倒数第n个结点，两次扫描链表，第一次得到链表的长度，第二次得到目标位置
     *
     * 时间复杂度:O(n)+O(n)=O(n)
     * @param headNode
     * @param site
     * @return
     */
    public ListNode getBackNode(ListNode headNode, int site) {
        int size = listLength(headNode);
        if (site > size || site < 1) {
            System.out.println("over the length or the site is illegal");
            return headNode;
        }
        //找倒数第N个结点变为从表头开始找第M-N+1个结点，M为表的长度
        //还有一种方法就是创建散列表。表中的条目是<结点的位置，结点地址>
        int length = 1;
        if (length < (size - site + 1)) {
            headNode = headNode.getNext();
            length++;
        }
        return headNode;
    }

    /**
     * 用一次链表扫描查找倒数第n个结点，主要方法是定义了两个指针进行移动
     *
     * 时间复杂度O(n)
     * @param headNode
     * @param site
     * @return
     */
    public ListNode getNodeFromEnd(ListNode headNode, int site) {
        //定义两个指针
        ListNode ptemp = headNode, pNext = null;
        //首先让ptemp指针移动site个位置
        for (int count = 1;count < site;count++) {
            ptemp = ptemp.getNext();
        }
        //接着同时移动pNext指针,ptemp指针移动到末尾
        while (ptemp != null) {
            //先移动pNext指针
            if (pNext == null) {
                pNext = headNode;
            } else {
                pNext = pNext.getNext();
            }
            //然后再移动ptemp指针，这样保证ptemp指针移动到末尾后,pNext指针刚好移动到倒数第n个位置，即目标地址
            ptemp = ptemp.getNext();
        }
        //判断是否为空
        if (pNext != null) {
            return pNext;
        } else {
            return null;
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
