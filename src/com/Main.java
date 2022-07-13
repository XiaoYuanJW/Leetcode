package com;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//        String[] strings = new String[]{"_","%"};
//        System.out.println(Arrays.toString(strings));
//        List<String> list = new ArrayList<>(Arrays.asList(strings));
//        System.out.println(list);

//        String str = "Hello Java. Java is a language.";
//        System.out.println(str.replace("Java.", "c++"));//打印 Hello c++ Java is a language.
//        System.out.println(str.replaceAll("Java.", "c++"));//打印 Hello c++ c++is a language.

//        List<String> SPECIALS = new ArrayList<>(Arrays.asList(new String[]{"_", "%"}));
//        System.out.println(SPECIALS);

        //Date
//        System.out.println(String.valueOf(new Date().getTime()));
        //String.valueOf()

//        Integer i = null;
//        System.out.println(String.valueOf(i));
//        System.out.println(null);

//        String path = "http://172.16.33.190:10806/img/admin/1652851831849.jpg";
//        int index = path.indexOf("/img/");
//        System.out.println(index);
//        String str = path.substring(index);
//        System.out.println(str);
//        String realPath = str.replaceFirst("/img/", "/home/images/");
//        System.out.println(realPath);

        //List
//        List<Integer> list = new ArrayList<>();
//        list.add(2);
//        list.add(3);
//        System.out.println(list);
//        Object a = "111";
//        Object b = "111";
//        System.out.println(a == b);
//        System.out.println((Integer) a == (Integer)b);
//        System.out.println(a.equals(b));

        //-
//        int a = 1;
//        System.out.println(-a);

        //List<T>

        //list
//        List<Integer> list = new ArrayList<>();
//        System.out.println(list.contains(1));

        //String
//        String name = "";
//        name = "Hello world";
//        System.out.println(name);

//        Object o = "";
//        String s = (String) o;
//        System.out.println(s);

//        Object o = 100;
//        String string = (String) o;
//        System.out.println(string);

//        Object o = "";
//        String string = String.valueOf(o);
//        System.out.println(o);
//        System.out.println(string == "");

//        Object o = null;
//        String str = String.valueOf(o);
//        System.out.println(str.isEmpty());

//        // 包装类型常量池技术
//        Integer i1 =  new Integer(100);
//        Integer i2 =  new Integer(100);
//        System.out.println(i1 == i2);
//        Integer a1 = 100;
//        Integer a2 = 100;
//        System.out.println(a1 == a2);
//        System.out.println(a1.equals(a2));
//        Integer a3 = 200;
//        Integer a4 = 200;
//        // == 对象比较
//        System.out.println(a3 == a4);
//        // equals 对象属性比较 值比较
//        System.out.println(a3.equals(a4));

//        // Object的equals方法容易抛出空指针异常
//        Object object1 = "test";
//        Object object2 = null;
//        System.out.println(object1 instanceof String);
//        System.out.println("test".equals(object1));
//        System.out.println(object1.equals("test"));
//        // 推荐使用 java.util.Objects#equals
//        System.out.println(Objects.equals("test", object1));
//        System.out.println(object2 instanceof String);
//        // 使用常量或确定有值的对象来调用equals
//        System.out.println("test".equals(object2));
//        System.out.println(object2.equals("test")); // 空指针异常
//        System.out.println(Objects.equals("test", object2));

//        // String + :底层原理：new一个StringBuilder对象，进行append操作，最后通过toString方法返回String对象，相较于直接使用StringBuilder的append造成了资源的浪费
//        String str = "hello";
//        str = str + " world!";
//        System.out.println(str);
//        // StringBuilder的append方法
//        StringBuilder sb = new StringBuilder("hello");
//        sb.append(" world!");
//        System.out.println(sb);

        // String的split方法 会忽略空值，导致ArrayIndexOutOfBoundsException异常
//        String str = "a,b,c,,";
//        String[] array = str.split(",");
//        System.out.println(array.length);
//        System.out.println(array[3]);

        // 集合处理
//        Map<String, Object> map = new HashMap<>();
//        map.put("a", 1);
//        System.out.println(map.get("a").equals(1));

        // ArrayList的subList方法 截取
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.subList(1, list.size()));

        // 集合转数组
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        String[] str = new String[list.size()];
////        list.toArray(str);
//        str = list.toArray(str);
//        System.out.println(str[1]);

        // 数组转集合
//        String[] str = new String[]{"a","b","c"};
//        List<String> list = Arrays.asList(str);
//        System.out.println(list);

        // 集合Iterator
//        List<String> list = new ArrayList<String>(){
//            {
//                add("a");
//                add("b");
//                add("c");
//            }
//        };
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String item = iterator.next();
//            if ("c".equals(item)) {
//                iterator.remove();
//            }
//        }
//        System.out.println(list);
        // 集合使用foreach循环里进行元素的remove/add操作，容易出现ConcurrentModificationException
//        for (String s : list) {
//            if ("c".equals(s)) {
//                list.remove(s);
//            }
//        }
//        System.out.println(list);

//        // 数组排序
//        Integer[] integers = new Integer[]{1,3,2};
//        Arrays.sort(integers);
//        System.out.println(Arrays.toString(integers));
//        // 集合排序
//        List<Integer> list = new ArrayList<Integer>(){
//            {
//                add(1);
//                add(3);
//                add(2);
//            }
//        };
//        Collections.sort(list);
//        list.forEach(System.out::println);

        // 集合初始化 HashMap(int init)
//        HashMap<String, Object> map = new HashMap<>(16);

        // entrySet遍历Map类集合KV
//        Map<String, Object> map = new HashMap<String, Object>(){
//            {
//                put("a", 1);
//                put("b", 2);
//                put("c", 3);
//            }
//        };
//        Iterator it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry entry = (Map.Entry) it.next();
//            System.out.println("Key:" + entry.getKey() + " " +
//                    "Value:" + entry.getValue());
//        }
        // KeySet遍历Map-迭代器
//        Iterator iterator = map.keySet().iterator();
//        while (iterator.hasNext()) {
//            String key = (String) iterator.next();
//            System.out.println("key:" + key + " " +
//                    "value:" + map.get(key));
//        }



    }
}
