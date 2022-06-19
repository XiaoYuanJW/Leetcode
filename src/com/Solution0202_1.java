package com;

import java.util.HashSet;
import java.util.Set;

public class Solution0202_1 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();/*利用集合判断是否判断出现循环*/
//        int len = String.valueOf(n).length();/*位数*/
        String num = String.valueOf(n);
        char[] chars = num.toCharArray();
        int sum = 0;
        while (!set.contains(Integer.parseInt(num))) {
            for (char c : chars) {
                sum += Math.pow(c-'0', 2);
            }
            if (sum == 1){
                return true;
            } else if (set.contains(Integer.parseInt(num))) {
                return true;
            }
            set.add(sum);
            sum = 0;
            num = String.valueOf(sum);
            chars = num.toCharArray();
        }
        return false;
    }
}
