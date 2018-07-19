package com.zhanghuanfa.link;

import java.util.LinkedList;

/**
 * @author zhanghuanfa 2018/7/5 11:41
 */
public class LinkListRun {

    public static void main(String[] args) {
        reverse();
        /*LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.remove(Integer.valueOf(2));
        System.out.println(linkedList);
        linkFirst();
        LinkListSelf linkList = getLinkListSelf();
        Integer find = linkList.findFirstMatch(2);
        System.out.println(find);*/
    }

    private static LinkListSelf getLinkListSelf() {
        LinkListSelf linkList = new LinkListSelf();
        linkList.add(1);
        linkList.add(2);
        linkList.add(3);
        System.out.println(linkList);
        return linkList;
    }

    private static void linkFirst() {
        LinkListSelf linkListSelf = new LinkListSelf();
        linkListSelf.addFirst(1);
        linkListSelf.addFirst(2);
        linkListSelf.addFirst(3);
        System.out.println(linkListSelf);
    }

    private static void reverse() {
        LinkListSelf linkListSelf = new LinkListSelf();
        linkListSelf.add(1);
        linkListSelf.add(2);
        linkListSelf.add(3);
        linkListSelf.add(4);
        System.out.println(linkListSelf);
        LinkListSelf reverse = linkListSelf.reverse();
        System.out.println("reverse: " + reverse);
    }
}
