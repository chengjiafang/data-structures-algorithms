package com.zhanghuanfa.link;

/**
 * 有序链表
 * @author zhanghuanfa 2018/7/9 9:45
 */
public class SortedList {

    private Node first;
    transient int size;

    public SortedList() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Insert the specified element to the correct position of the list
     *
     * @param element element to be inserted into the sorted list
     */
    public void add(int element) {
        Node newNode = new Node(element);
        Node previous = null;
        Node current = first;
        while (current != null && element > current.getValue() ) {
            previous = current;
            current = current.getNext();
        }
        if (previous == null) {     // previous is null, the current is the head of the list
            first = newNode;
        } else {
            previous.setNext(newNode);
        }
        newNode.setNext(current);
        size++;
    }

    /**
     * Retrieves and removes the head (first element) of the list
     *
     * @return the head of the list
     */
    public Integer remove() {
        Node re = first;
        if (re != null) {
            first = first.getNext();
        }
        size--;
        return re == null ? null : re.getValue();
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
