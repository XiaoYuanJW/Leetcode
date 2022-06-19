package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by YuanJW on 2022/6/9.
 * 171. Excel 表列序号-方法一：HashMap
 */
public class Solution0171_1 {
    public int titleToNumber(String columnTitle) {
        Map<Character, Integer> map = new HashMap<>(); //
        char[] chars = columnTitle.toCharArray();
        int ans = 0;
        for (int i = chars.length - 1; i >= 0; i--) {
            ans += map.get(chars[i]);

        }
        return ans;
    }
}
