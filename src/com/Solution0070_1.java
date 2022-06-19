package com;

/**
 * 70.爬楼梯-方法一：递归
 */
public class Solution0070_1 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2){
            return 2;
        } else {
            return climbStairs(n-1) + climbStairs(n-2);/*找出规律-递推公式：Fn = Fn-1 + Fn-2*/
        }
    }
}
