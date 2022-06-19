package com;

/**
 * 70.爬楼梯-方法三：动态规划
 */
public class Solution0070_3 {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n+1];/*记录n个状态*/
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n ; i++) {/*从1到n依次更新*/
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
