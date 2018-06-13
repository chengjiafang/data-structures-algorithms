package com.zhanghuanfa.sort.select;

import com.zhanghuanfa.sort.base.ArrayBase;

/**
 * @author zhanghuanfa  2018-06-04 17:04
 */
class ArraySelect extends ArrayBase {

    ArraySelect(int max) {
        super(max);
    }

    void selectionSort() {
        int min;
        long temp;
        for (int out = 0; out < this.numOfElements - 1; out++) {
            min = out;
            for (int in = min + 1; in < this.numOfElements; in++) {
                if (this.a[min] > this.a[in]) {
                    min = in;
                }
            }
            temp = this.a[min];
            this.a[min] = this.a[out];
            this.a[out] = temp;
        }
    }

}
