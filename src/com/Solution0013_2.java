package com;

/**
 * 13. 罗马数字转整数-方法二：switch
 */
public class Solution0013_2 {
    public int getValue(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public int romanToInt(String s) {
        int ans = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int value = getValue(s.charAt(i));
            if (i < len-1 && value < getValue(s.charAt(i+1))) {
                ans -= value;
            } else {
                ans += value;
            }
        }
        return ans;
    }
}
