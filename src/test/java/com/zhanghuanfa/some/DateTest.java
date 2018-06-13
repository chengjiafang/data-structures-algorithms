package com.zhanghuanfa.some;

import com.google.common.collect.Lists;
import org.apache.commons.lang.time.DateUtils;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @author zhanghuanfa  2018-06-11 18:11
 */
public class DateTest {

    public static void main(String[] args) throws ParseException {
        Date now = Calendar.getInstance().getTime();
        System.out.println(now);
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date beginDate = dateFormat2.parse("2018-06-18 12:36:01");
        System.out.println(beginDate);
        boolean before7Days = DateUtils.addDays(now, 7).before(beginDate);
        System.out.println(before7Days);
    }

    @Test
    public void test() {
        List<Integer> a = Lists.newArrayList(1,2,3);
        List<Integer> b = Lists.newArrayList();
        System.out.println(a.containsAll(b));
//        List<Integer> tmp = Lists.newArrayList(a);
//        a.removeAll(b);
//        System.out.println(a);
//        b.removeAll(tmp);
//        System.out.println(tmp);
//        System.out.println(b);
    }
}
