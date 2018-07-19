package com.zhanghuanfa.stack;

import com.zhanghuanfa.link.LinkListSelf;

/**
 * 基于自定义的双端单向链表实现的栈
 * @author zhanghuanfa 2018/7/8 14:48
 */
public class LinkStack {

    /**自定义的双端单向链表*/
    private LinkListSelf link;

    LinkStack() {
        link = new LinkListSelf();
    }

    public void push(int element) {
        link.addFirst(element);
    }

    public Integer pop() {
        return link.removeFirst();
    }

    public int size() {
        return link.size();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }

    @Override
    public String toString() {
        return link.toString();
    }
}
