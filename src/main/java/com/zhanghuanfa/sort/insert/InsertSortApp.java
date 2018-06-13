package com.zhanghuanfa.sort.insert;

/**
 * @author zhanghuanfa  2018-06-05 9:05
 */
public class InsertSortApp {

    public static void main(String[] args) {
        ArrayInsert arrayInsert = new ArrayInsert(100);
        for (int i = 0; i < 10; i++) {
            arrayInsert.insert((long) (Math.random()*100));
        }
        System.out.println("排序前:");
        arrayInsert.display();
        arrayInsert.insertSort();
        System.out.println("\n排序后:");
        arrayInsert.display();
    }
}
