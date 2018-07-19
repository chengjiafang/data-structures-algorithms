package com.zhanghuanfa.queue;

/**
 * @author zhanghuanfa 2018/7/8 15:23
 */
public class LinkQueueRun {

    public static void main(String[] args) {
        LinkQueue linkQueue = new LinkQueue();
        linkQueue.add(21);
        linkQueue.add(32);
        System.out.println(linkQueue);
        linkQueue.add(12);
        System.out.println(linkQueue);
        linkQueue.remove();
        System.out.println(linkQueue);
    }
}
