package com;

/**
 * 1920. 基于排列构建数组
 */
public class Solution1920 {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        /*遍历*/
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
