package com.zhanghuanfa.link;

import lombok.Data;

/**
 * @author zhanghuanfa 2018/6/30 15:15
 */
@Data
public class Node {

    private int value;
    private Node next;

    Node() {

    }

    Node(int value) {
        this.value = value;
    }

    public void add(int value) {
        Node node = new Node();
        node.setValue(value);
        if (this.next == null) {
            this.next = node;
        } else {
            Node temp = this.next;
            while (true) {
                if (temp.next == null) {
                    temp.next = node;
                    break;
                }
                temp = temp.next;
            }
        }
    }

    /**
     * 单链表反转
     * @return 反转后的链表
     */
    private Node reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        Node next = current.getNext();
        Node tmp;
        current.setNext(null);
        while (next != null) {
            tmp = next.getNext();
            next.setNext(current);
            current = next;
            next = tmp;
        }
        return current;
    }

    public String toString() {
        StringBuilder str = new StringBuilder("[");
        Node current = this;
        while (current != null) {
            str.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        str.delete(str.length()-2, str.length()).append("]");
        return str.toString();
    }

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        System.out.println(head);
        Node reverse = head.reverse(head);
        System.out.println(reverse);
    }
}
