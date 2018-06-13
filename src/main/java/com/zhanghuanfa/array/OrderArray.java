package com.zhanghuanfa.array;

/**
 * @author zhanghuanfa  2018-06-04 14:00
 */
public class OrderArray {

    private long[] a;
    private int numOfElements;

    public int size() {
        return this.numOfElements;
    }

    public int find(long searchKey) {
        int lowerIndex = 0;
        int upperIndex = this.numOfElements - 1;
        int currentIndex;

        while (true) {
            currentIndex = (lowerIndex + upperIndex) / 2;
            if (a[currentIndex] == searchKey) {
                return currentIndex;
            } else if (lowerIndex > upperIndex) {
                return this.numOfElements;
            } else {
                if (a[currentIndex] < searchKey) {
                    lowerIndex = currentIndex + 1;
                } else {
                    upperIndex = currentIndex - 1;
                }
            }
        }
    }

    public void insert(long value) {
        int j;
        for (j = 0; j < this.numOfElements; j++) {
            if (a[j] > value) {
                break;
            }
        }
        for (int k = this.numOfElements; k > j; k--) {
            a[k] = a[k - 1];
        }
        a[j] = value;
        this.numOfElements++;
    }
}
