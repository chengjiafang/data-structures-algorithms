package com.zhanghuanfa.finaltest;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author zhanghuanfa  2018-06-14 10:07
 */
public class Run {

    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("Tom");
        user = new User();
        System.out.println(user);
        final User finalUser = new User();

    }

    @Test
    public void testDebug() {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        System.out.println(set);
    }

    @Test
    public void test() throws NoSuchFieldException, IllegalAccessException {
        Class cache = Integer.class.getDeclaredClasses()[0];
        Field cache1 = cache.getDeclaredField("cache");
        cache1.setAccessible(true);
        Integer[] newCache = (Integer[]) cache1.get(cache);
        newCache[132] = newCache[133];
        int a = 2;
        int b = a + a;
        System.out.println("b的值为:" + b);
        System.out.println("Integer.valueOf(b)后的值" + Integer.valueOf(b));
        System.out.println("Integer.valueOf(b)后的值" + b);
        System.out.printf("%d + %d = %d", a, a, b);
    }

    @Test
    public void testFinalList() {
        final List<Integer> nums = Lists.newArrayListWithCapacity(1);
        nums.add(1);
        System.out.println(nums);
        nums.add(2);
        System.out.println(nums);
    }

    @Test
    public void test1() {
        StringBuilder sb = new StringBuilder("good");
        String s = sb.toString();
        System.out.println(s.intern() == s);
        String s1 = new StringBuilder("go").append("od")
                .toString();
        System.out.println(s1.intern() == s1);  // true
//        String s2 = new StringBuilder("ja")
//                .append("va").toString();
//        System.out.println(s2.intern() == s2);  // false
//        String s3 = new String("good");
//        System.out.println(s1 == s3);           // false
//        System.out.println(s1 == s3.intern());  // true
//        System.out.println(s1 == s3);
    }

    @Test
    public void test2() {
        String s1 = new String("good");
        String s2 = new String("good");
        System.out.println(s1.intern() == s1);  // false
        System.out.println(s1 == s2);// false
        System.out.println(s1 == s2.intern());  // false
    }


    @Test
    public void test3() {
        String s1 = "go" + "od";
        System.out.println(s1.intern() == s1);  // true

        String s2 = "ja" + "va";
        System.out.println(s2.intern() == s2);  // true
        String s3 = new String("good");
        System.out.println(s1 == s3);           // false
        System.out.println(s1 == s3.intern());  // true
    }

    @Test
    public void test4() {
        String s1 = new String("good");
        String s2 = new String("good");
        System.out.println(s1 == s1.intern());  // false
        System.out.println(s1 == s2);           // false
        System.out.println(s1 == s2.intern());  // false
    }

    @Test
    public void test5() {
        ArrayList<User> users = Lists.newArrayList(User.builder().id(132232).build(), User.builder().id(2).build());
        List<Integer> ids = new ArrayList<>(1);
        ids.add(132232);
        List<User> a = new ArrayList<>();
        ids.forEach(i->{
            User user = users.stream().filter(u -> u.getId().equals(i)).findAny().get();

            a.add(user);
        });
        System.out.println(a);
    }
}
