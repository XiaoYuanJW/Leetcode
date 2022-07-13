package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by YuanJW on 2022/6/21.
 */
public class Test {

    public static void main(String[] args) {
        // SimpleDateFormat格式化日期：线程不安全
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String date = sdf.format(new Date());
//        System.out.println(date);

//        String a = "abcdefg";
//        String b = "abcdefg";
//        String c = new String("abcdefg");
//        System.out.println(a==b); // 对象相同（包装类型常量池）
//        System.out.println(a.equals(b)); // 属性相同即值相等（String重写Object父类equals方法）
//        System.out.println(a==c); // 对象相同（包装类型常量池）
//        System.out.println(a.equals(c)); // 属性相同即值相等（String重写Object父类equals方法）
//
//        StringBuilder sb = new StringBuilder(null);
//        sb.append("A");
//        System.out.println(sb);
    }

    // DateUtils工具类：线程安全
    private static final ThreadLocal<DateFormat> df = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
//    private static final ThreadLocal<DateFormat> df = new ThreadLocal<DateFormat>() {
//        @Override
//        public DateFormat initialValue() {
//            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        }
//    };


}
