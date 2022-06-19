package com;

/**
 * 53. 最大子数组和-方法二：动态规划
 */
public class Solution0053_2 {
    public int maxSubArray(int[] nums) {
        int pre = 0;/*当前最大和*/
        int maxAns = nums[0];/*最大子数组和*/
        for (int num : nums) {/*迭代*/
            pre = Math.max(pre + num, num);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
