package com.zhanghuanfa.stack;

/**
 * @author zhanghuanfa  2018-06-05 18:19
 */
public class StackApp {

    public static void main(String[] args) {
        StackX stack = new StackX(10);
        for (int i=0; i<5; i++) {
            long value = (long) (Math.random() * 100);
            System.out.println(value);
            stack.push(value);
        }
        while (!stack.isEmpty()) {
            long pop = stack.pop();
            System.out.print(pop + " ");
        }
        System.out.println();
    }
}
