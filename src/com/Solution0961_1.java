package com;

/**
 * 961. 在长度 2N 的数组中找出重复 N 次的元素
 */
public class Solution0961_1 {
    public int repeatedNTimes(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len-2; i++) {/*存在连续的三个数中两个相等*/
            if(nums[i] == nums[i+1]||nums[i] == nums[i+1]){
                return nums[i];
            }
        }
        return nums[len-1];
    }
}
