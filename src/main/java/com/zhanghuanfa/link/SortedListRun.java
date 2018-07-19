package com.zhanghuanfa.link;

/**
 * @author zhanghuanfa 2018/7/9 10:12
 */
public class SortedListRun {

    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.add(2);
        sortedList.add(1);
        sortedList.add(23);
        System.out.println(sortedList);
        sortedList.add(15);
        System.out.println(sortedList);
        sortedList.remove();
        System.out.println(sortedList);
    }
}
