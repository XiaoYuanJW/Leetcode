package com;

/**
 * 28.实现 strStr()-方法一：暴力匹配
 */
public class Solution0028_1 {
    public int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        int len1 = haystack.length();
        int len2 = needle.length();
        while (j < len2 && i < len1) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
            } else {
                i = i - j + 1;
                j = 0;
            }
        }
        if (j < len2){
            return i - j;
        } else {
            return -1;
        }
    }
}
