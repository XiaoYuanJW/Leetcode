package com;

/**
 * 58. 最后一个单词的长度-方法一：split数组
 */
public class Solution0058_1 {
    public int lengthOfLastWord(String s) {
        int len = s.length();
        String[] strArray = s.split(" ");
        return strArray[strArray.length-1].length();
    }
}
