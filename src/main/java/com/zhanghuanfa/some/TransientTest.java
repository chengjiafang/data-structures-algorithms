package com.zhanghuanfa.some;

import java.io.*;

/**
 * @author zhanghuanfa  2018-06-11 10:59
 */
public class TransientTest {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = User.newBuilder().age(10).name("Tom").build();
        System.out.println("原始对象" + user);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("D:\\IdeaProjects\\java-study\\data-structures-algorithms\\src\\test\\1.txt"));
        // 往流写入对象
        objectOutputStream.writeObject(user);
        objectOutputStream.close();
        // 从流中读取对象
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("D:\\IdeaProjects\\java-study\\data-structures-algorithms\\src\\test\\1.txt"));
        User o = (User) objectInputStream.readObject();
        System.out.println("反序列化后的对象" + o);
        System.out.println("直接获取属性" + o.getAge());
        System.out.println("方法获取属性" + o.age());
        objectInputStream.close();
    }


}
