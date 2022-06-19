package com;

import java.util.HashMap;
import java.util.Map;

/**
 * 13. 罗马数字转整数-方法一：模拟（使用Map<key,value>）
 */
public class Solution0013_1 {
    /*使用键值对保存对应关系*/
    Map<Character, Integer> symbolValues = new HashMap<Character, Integer>(){{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
    public int romanToInt(String s) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len ; i++ ) {
            int value = symbolValues.get(s.charAt(i));
            if (i < len-1 && value < symbolValues.get(s.charAt(i+1))){
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }
}
