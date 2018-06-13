package com.zhanghuanfa.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhanghuanfa  2018-06-04 11:22
 */
public class ListTest {
    public static void main(String[] args) {
        List a = new ArrayList(10);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
        a.add(1);
    }

    @Test
    public void objectArray() {
        Object[] array = new Object[10];
        array[0] = 1;
        array[0] = 2;
        array[1] = 1;
        array[2] = 1;
        System.out.println("array's length: " + array.length);
        System.out.println(array[3]);
    }
}
