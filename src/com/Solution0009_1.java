package com;

/**
 * 9. 回文数-方法一：字符串
 */
public class Solution0009_1 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        int length = str.length();
        for(int i=0;i<length/2;i++){
            if(str.charAt(i)!=str.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }
}
