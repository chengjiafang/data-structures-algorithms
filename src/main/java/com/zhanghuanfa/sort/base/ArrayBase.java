package com.zhanghuanfa.sort.base;

/**
 * @author zhanghuanfa  2018-06-04 17:07
 */
public abstract class ArrayBase {

    protected long[] a;
    protected int numOfElements;

    protected ArrayBase(int max) {
        this.a = new long[max];
        this.numOfElements = 0;
    }

    public void insert(long value) {
        a[numOfElements] = value;
        numOfElements++;
    }

    public void display() {
        for (int i = 0; i < this.numOfElements; i++) {
            System.out.print(this.a[i] + " ");
        }
    }
}
