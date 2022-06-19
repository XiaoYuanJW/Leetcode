package com;

/**
 * 53. 最大子数组和-方法一：贪心算法-局部最优解
 */
public class Solution0053_1 {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int result = Integer.MIN_VALUE;/*最大和*//*类似寻找最大值最小值的题目，初始值一定要定义成理论上的最小最大值*/
        int sum = 0;/*当前最和*/
        for (int i = 0; i < len ; i++) {/*迭代*/
            sum += nums[i];
            result = Math.max(result, sum);/*更新最大值*/
            if (sum < 0) {/*当前指针所指元素之前的和小于0,丢弃当前元素之前的数列*/
                sum = 0;
            }
        }
        return result;
    }
}
