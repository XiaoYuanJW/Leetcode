package com;

/**
 * 9. 回文数-方法一：字符串
 */
public class Solution0009_2 {
    public static boolean isPalindrome(int x) {
        String str = String.valueOf(x); //String.valueOf转字符串
        int low = 0;
        int high = str.length()-1;
        while(high>low){    //‘指针’两头逼近
            if(str.charAt(low)==str.charAt(high)){  // 获取字符串位序元素
                low++;
                high--;
            }else{
                return false;
            }
        }
        return true;
    }
}
