package com.zhanghuanfa.sort.shell;

import com.zhanghuanfa.sort.base.ArrayBase;

/**
 * @author zhanghuanfa 2018/7/19 14:49
 */
public class ArrayShell extends ArrayBase {

    protected ArrayShell(int max) {
        super(max);
    }

    void shellSort() {
        int h = 1;
        int inner, outer;
        long temp;
        while (h <= this.numOfElements / 3) {
            h = h * 3 + 1;
        }

        while (h > 0) {
            for (outer = h; outer < this.numOfElements; outer++) {
                temp = this.a[outer];
                inner = outer;
                while (inner > h - 1 && this.a[inner - h] >= temp) {
                    this.a[inner] = this.a[inner - h];
                    inner -= h;
                }
                this.a[inner] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
