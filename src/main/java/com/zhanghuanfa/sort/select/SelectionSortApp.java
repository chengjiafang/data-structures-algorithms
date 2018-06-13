package com.zhanghuanfa.sort.select;

/**
 * 冒泡排序:
 * 冒泡排序的比较次数为：N*(N-1)/2,交换次数为：N*N
 * 故冒泡排序的时间复杂度为O(N^2)
 * @author zhanghuanfa  2018-06-04 17:15
 */
public class SelectionSortApp {

    public static void main(String[] args) {
        ArraySelect select = new ArraySelect(100);
        for (int i = 0; i < 10; i++) {
            select.insert((long) (Math.random()*100));
        }
        System.out.println("排序前:");
        select.display();
        select.selectionSort();
        System.out.println("\n排序后:");
        select.display();
    }
}
