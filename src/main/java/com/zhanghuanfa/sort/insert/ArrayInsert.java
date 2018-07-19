package com.zhanghuanfa.sort.insert;

import com.zhanghuanfa.sort.base.ArrayBase;

/**
 * 插入排序
 * @author zhanghuanfa  2018-06-05 9:04
 */
class ArrayInsert extends ArrayBase {

    ArrayInsert(int max) {
        super(max);
    }

    void insertSort() {
        int out = 1;
        int in;
        long temp;
        for (; out < this.numOfElements; out++) {
            temp = this.a[out];
            in = out;
            while (in > 0 && temp < this.a[in-1]){
                this.a[in] = this.a[in-1];
                in--;
            }
            this.a[in] = temp;
        }
    }
}
