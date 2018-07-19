package com.zhanghuanfa.sort.shell;

/**
 * @author zhanghuanfa 2018/7/19 15:11
 */
public class ShellSortApp {

    public static void main(String[] args) {
        ArrayShell shell = new ArrayShell(10);
        for (int i = 0; i < 10; i++) {
            shell.insert((long) (Math.random()*100));
        }
        System.out.println("排序前:");
        shell.display();
        shell.shellSort();
        System.out.println("\n排序后:");
        shell.display();
    }
}
