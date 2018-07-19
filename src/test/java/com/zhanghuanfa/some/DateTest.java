package com.zhanghuanfa.some;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
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

    @Test
    public void test01() {
        String jsonStr = "[{\"beginHour\":7,\"beginMinute\":0,\"code\":1,\"endHour\":8,\"endMinute\":0}]";
        List<AddClassTeachingTimeParam> addClassTeachingTimeParams = JSONArray.parseArray(jsonStr, AddClassTeachingTimeParam.class);
        System.out.println(addClassTeachingTimeParams);
        Date time = Calendar.getInstance().getTime();
        SimpleDateFormat hourFormat = new SimpleDateFormat("HH");
        int i = Integer.parseInt(hourFormat.format(time));
        System.out.println(i);
        SimpleDateFormat minuteFormat = new SimpleDateFormat("mm");
        int minute = Integer.parseInt(minuteFormat.format(time));
        System.out.println(minute);
        AddClassTeachingTimeParam a = new AddClassTeachingTimeParam();
        a.setBeginHour(i);
        a.setBeginMinute(minute);
        System.out.println(a);
    }
}
