package com.test.collection;

import java.util.Random;

/**
 * Random工具类
 * Created by YuanJW on 2022/7/13.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(-100, 100)
                .limit(10)
                .filter(value -> value < 0)
                .sorted()
                .forEach(System.out::println);
    }
}
