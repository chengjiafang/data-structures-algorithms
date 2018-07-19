package com.zhanghuanfa.queue;

import com.zhanghuanfa.link.LinkListSelf;

/**
 * 基于双端单向链表实现的队列
 * @author zhanghuanfa 2018/7/8 15:16
 */
public class LinkQueue {

    private LinkListSelf link;

    LinkQueue() {
        link = new LinkListSelf();
    }

    public boolean isEmpty() {
        return link.isEmpty();
    }

    public void add(int element) {
        link.addFirst(element);
    }

    public Integer remove() {
        return link.removeLast();
    }

    @Override
    public String toString() {
        return link.toString();
    }
}
