package com.zhanghuanfa.link;

/**
 * @author zhanghuanfa 2018/6/30 15:19
 */
public class Run {

    public static void main(String[] args) {
        Node node = init();
        // 单链表循环打印
        while (node != null) {
            System.out.print(node.getValue() + "\t");
            node = node.getNext();
        }
        // 移除奇数位的节点
        Node head = init();
        Node temp = head;
        while (temp != null && temp.getNext() != null) {
            temp.setNext(temp.getNext().getNext());
            temp = temp.getNext();
        }
        System.out.println(head);
    }

    static Node init() {
        Node link = new Node();
        link.setValue(1);
        for (int i = 2; i < 10; i++) {
            link.add(i);
        }
        return link;
    }


}
