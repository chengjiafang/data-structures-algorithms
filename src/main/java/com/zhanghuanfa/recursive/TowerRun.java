package com.zhanghuanfa.recursive;

/**
 * 汉诺塔问题
 *
 * @author zhanghuanfa 2018/7/9 18:37
 */
public class TowerRun {

    private static int num = 3;

    public static void main(String[] args) {
        doTowers(num, 'A' , 'B', 'C');
    }

    private static void doTowers(int topNum, char from, char inter, char to) {
        if (topNum == 1) {
            System.out.println("Disk 1 from " + from + " to " + to);
        } else {
            doTowers(topNum - 1, from, to, inter);
            System.out.println("Disk " + topNum + " from " + from + " to " + to);
            doTowers(topNum - 1, inter, from, to);
        }
    }
}
