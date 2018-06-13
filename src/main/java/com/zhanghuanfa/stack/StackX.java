package com.zhanghuanfa.stack;

/**
 * @author zhanghuanfa  2018-06-05 18:14
 */
public class StackX {

    private int maxSize;
    private long[] stackArray;
    private int top;

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new long[maxSize];
        this.top = -1;
    }

    public void push(long value) {
        stackArray[++top] = value;
    }

    public long pop() {
        return stackArray[top--];
    }

    public long peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public boolean isFull() {
        return this.top == this.maxSize - 1;
    }
}
