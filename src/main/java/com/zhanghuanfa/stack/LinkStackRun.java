package com.zhanghuanfa.stack;

/**
 * @author zhanghuanfa 2018/7/8 15:08
 */
public class LinkStackRun {

    public static void main(String[] args) {
        LinkStack linkStack = new LinkStack();
        linkStack.push(1);
        linkStack.push(10);
        System.out.println(linkStack);
        linkStack.push(5);
        System.out.println(linkStack);
        linkStack.pop();
        System.out.println(linkStack);
    }
}
