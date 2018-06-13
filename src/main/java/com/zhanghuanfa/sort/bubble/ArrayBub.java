package com.zhanghuanfa.sort.bubble;

import com.zhanghuanfa.sort.base.ArrayBase;

/**
 * @author zhanghuanfa  2018-06-04 16:35
 */
class ArrayBub extends ArrayBase {

    ArrayBub(int max) {
        super(max);
    }

    void bubbleSort() {
        int out = this.numOfElements- 1, in = 0;
        for (; out > 0; out--) {
            for (int j = in; j < out; j++) {
                if (this.a[j] > this.a[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    private void swap(int j, int i) {
        long tmp = this.a[j];
        this.a[j] = this.a[i];
        this.a[i] = tmp;
    }


}
