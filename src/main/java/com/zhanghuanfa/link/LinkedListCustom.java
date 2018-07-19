package com.zhanghuanfa.link;

import java.util.NoSuchElementException;

/**
 * 自定义双向链表
 *
 * @author zhanghuanfa 2018/7/9 13:25
 */
public class LinkedListCustom {

    private transient int size;
    private transient Node first;
    private transient Node last;

    public LinkedListCustom() {

    }

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #addLast}.
     *
     * @param e the element to add
     */
    public void add(Integer e) {
        linkLast(e);
    }

    /**
     * Appends the specified element to the end of this list.
     *
     * <p>This method is equivalent to {@link #add}.
     *
     * @param e the element to add
     */
    public void addLast(Integer e) {
        linkLast(e);
    }

    public void addFirst(Integer e) {
        linkFirst(e);
    }

    public Integer remove() {
        return removeFirst();
    }

    public Integer removeFirst() {
        final Node f = first;
        if(f == null) {
            throw new NoSuchElementException();
        }
        return unlinkFirst(f);
    }

    public Integer removeLast() {
        final Node l = last;
        if (l == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast(l);
    }

    private void linkLast(Integer e) {
        final Node l = last;
        final Node newNode = new Node(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    private void linkFirst(Integer e) {
        final Node f = first;
        final Node newNode = new Node(null, e, f);
        first = newNode;
        if (isEmpty()) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    private Integer unlinkLast(Node l) {
//        assert l == last && l != null;
        final Integer item = l.item;
        final Node prev = l.prev;
        l.item = null;
        l.prev = null;
        last = prev;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
        size--;
        return item;
    }

    private Integer unlinkFirst(Node f) {
//        assert f == first && f != null;
        final Integer item = f.item;
        final Node next = f.next;
        f.item = null;
        f.next = null;  // help GC
        first = next;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        return item;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }


    private static class Node {
        Integer item;
        Node prev;
        Node next;

        Node(Node prev, Integer item, Node next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            sb.append(current.item).append(", ");
            current = current.next;
        }
        sb.delete(sb.length()-2, sb.length()).append("]");
        return sb.toString();
    }
}
