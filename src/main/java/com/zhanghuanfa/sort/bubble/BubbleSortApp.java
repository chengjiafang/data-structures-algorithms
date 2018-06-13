package com.zhanghuanfa.sort.bubble;

/**
 * 选择排序:
 * 选择排序的比较次数为：N*(N-1)/2,交换次数为：N
 * 对于N值很大时,比较的次数是主要的,故选择排序的时间复杂度也为O(N^2)
 * 对于N值较小时,特别是如果交换的时间级比比较的时间级大得多时,选择排序还是挺快得
 * @author zhanghuanfa  2018-06-04 16:42
 */
public class BubbleSortApp {

    public static void main(String[] args) {
        int max = 100;
        ArrayBub arrayBub = new ArrayBub(max);
        for (int i = 0; i < 10; i++) {
            arrayBub.insert((long) (Math.random() * 100));
        }
        System.out.println("排序前:");
        arrayBub.display();
        arrayBub.bubbleSort();
        System.out.println("\n排序后:");
        arrayBub.display();
    }
}
