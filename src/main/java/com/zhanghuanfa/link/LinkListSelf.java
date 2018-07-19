package com.zhanghuanfa.link;

import java.util.NoSuchElementException;

/**
 * 双端单向链表
 * @author zhanghuanfa 2018/7/5 10:12
 */
public class LinkListSelf {

    private Node first;
    private Node last;
    /**
     * transient关键字, 用于指明该属性不进行序列化
     */
    transient int size = 0;

    public LinkListSelf() {

    }

    public void add(int element) {
        linkLast(element);
    }

    public void addFirst(int element) {
        linkFirst(element);
    }

    private void linkFirst(int element) {
        final Node newNode = new Node();
        final Node f = first;
        newNode.setValue(element);
        newNode.setNext(f);
        first = newNode;
        if (f == null) {
            last = newNode;
        }
        size++;
    }

    private void linkLast(int element) {
        final Node l = last;
        final Node newNode = new Node();
        newNode.setValue(element);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.setNext(newNode);
        }
        size++;
    }

    public int removeFirst() {
        final Node f = first;
        if (f == null) {
            throw new NoSuchElementException();
        }
        return unlinkFirst(f);
    }

    private int unlinkFirst(Node f) {
        // assert f == first && f != null;
        final int element = f.getValue();
        final Node next = f.getNext();
        first.setNext(null);
        first = next;
        if (next == null) {
            last = null;
        } else {
            last = next.getNext();
        }
        size--;
        return element;
    }

    public int removeLast() {
        final Node l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast();
    }

    private int unlinkLast() {
//        assert l == last && l != null;
        Node current = first;
        Node tmp = first;
        while (current.getNext() != null) {
            if (current.getNext().getNext() == null) {
                tmp = current.getNext();
                current.setNext(null);
                break;
            }
            current = current.getNext();
        }
        return tmp.getValue();
    }

    public Integer findFirstMatch(int element) {
        Node current = first;
        while (current != null) {
            if (current.getValue() == element) {
                break;
            }
            current = current.getNext();
        }
        return current == null ? null : current.getValue();
    }

    public LinkListSelf reverse() {
        LinkListSelf reverse = new LinkListSelf();
        Node current = first;
        while (current != null) {
            reverse.linkFirst(current.getValue());
            current = current.getNext();
        }
        return reverse;
    }

    private boolean isElementIndex(int index) {
        return index >=0 && index < size;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            sb.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        sb.delete(sb.length()-2, sb.length()).append("]");
        return sb.toString();
    }
}
