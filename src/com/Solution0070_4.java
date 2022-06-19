package com;

/**
 * 70.爬楼梯-方法四：动态规划优化-斐波那契数列
 */
public class Solution0070_4 {
    public int climbStairs(int n) {
        if (n == 1){
            return 1;
        }
        int first = 1;
        int second = 2;
        for (int i = 2; i < n ; i++) {/*滚动数组*/
            int third = first + second;/*优化空间复杂度，只记录两个状态*/
            first = second;
            second = third;
        }
        return second;
    }
}
