package com.zhanghuanfa.link;

/**
 * @author zhanghuanfa 2018/7/9 13:53
 */
public class LinkedListCustomRun {

    public static void main(String[] args) {
        LinkedListCustom linkedListCustom = new LinkedListCustom();
        System.out.println("list isEmpty? " + linkedListCustom.isEmpty());
        linkedListCustom.add(21);
        linkedListCustom.add(12);
        linkedListCustom.add(15);
        System.out.println(linkedListCustom);
        linkedListCustom.removeFirst();
        linkedListCustom.removeFirst();
        System.out.println(linkedListCustom);
        linkedListCustom.addFirst(13);
        linkedListCustom.addFirst(31);
        System.out.println(linkedListCustom);
        linkedListCustom.remove();
        System.out.println(linkedListCustom);
    }
}
