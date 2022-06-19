package com;

/**
 * 5. 最长回文子串-方法一：暴力解法
 */
public class Solution0005_1 {
    public String longestPalindrome(String s) {
        int len = s.length();/*字符串的长度*/
        if (len < 2){/*字符串长度*/
            return s;
        }
        int max = 1;/*最长回文子串长度（注意：这里的初始值是1-回文子串长度最小为）*/
        int begin = 0;/*最长回文子串起点位置*/
        char[] charArray = s.toCharArray();/*使用s.charAt(i)每次都会检查数组下标越界-转换成字符串数组*/
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len ; j++) {
                if(j-i+1 > max && VaildPalindromic(charArray,i,j)){
                    max = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + max);
    }
    /*验证字串 s[left~right] 是否是回文串*/
    public boolean VaildPalindromic(char[] charArray, int left, int right) {
        while (left < right) {/*循环条件*/
            if (charArray[left] != charArray[right]) {/*不满足回文数条件-直接跳出循环*/
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
