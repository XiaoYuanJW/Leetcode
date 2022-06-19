package com;

import java.util.Arrays;

/**
 * 169.多数元素-方法三：排序
 */
public class Solution0169_3 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
