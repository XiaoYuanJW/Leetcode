package com;

/**
 * 70.爬楼梯-方法二：记忆化递归
 */
public class Solution0070_2 {
    public int climbStairs(int n) {
        int memo[] = new int[n+1];/*存储中间结果，避免重复计算*/
        return climbStairsMemo(n, memo);
    }
    public int climbStairsMemo(int n, int memo[]){
        if(memo[n] > 0){
            return memo[n];
        }
        if (n == 1){
            memo[n] = 1;
            return 1;
        } else if (n == 2){
            memo[n] = 2;
            return 2;
        } else {
            return climbStairsMemo(n-1, memo) + climbStairsMemo(n-2, memo);
        }
    }
}
