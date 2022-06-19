package com;

import java.util.Arrays;

/**
 * 217. 存在重复元素-方法二：排序
 */
public class Solution0217_2 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
