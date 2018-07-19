package com.zhanghuanfa.sort.merge;

/**
 * 归并排序
 * @author zhanghuanfa 2018/7/18 10:33
 */
public class MergeSortRun {

    public static void main(String[] args) {
//        int[] src = {23, 47, 81, 95, 7, 14, 39, 55, 62, 74};
//        int[] dest = src.clone();
        int[] src = {81, 23, 47, 24, 11, 32};
        int[] dest = src.clone();
        mergeSort(src, dest, 0, src.length);
        display(dest, dest.length);
    }

    private static void mergeSort(int[] src, int[] dest, int low, int high) {
        int length = high - low;
        if (length <= 1) {
            return ;
        }

        int mid = (low + high) >>> 1;
        mergeSort(dest, src, low, mid);
        mergeSort(dest, src, mid, high);

        for (int i = low, p = low, q = mid; i < high; i++) {
            if (q >= high || p < mid && (src[p] - src[q]) <= 0) {
                dest[i] = src[p++];
            } else {
                dest[i] = src[q++];
            }
        }
    }

    private static void display(int[] array, int size) {
        for (int j = 0; j < size; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

}
