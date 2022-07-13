package com.test.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器-Iterator
 * Created by YuanJW on 2022/7/13.
 */
public class IteratorTest {
    public static void main(String[] args) {
        // 使用迭代器操作List列表
        List<Integer> list = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
            }
        };
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(2)) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
