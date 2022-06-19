package com;

/**
 * 169.多数元素-方法一：摩尔投票法
 */
public class Solution0169_1 {
    public int majorityElement(int[] nums) {
        int target = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (cnt == 0) {
                target = nums[i];
            }
            if (nums[i] == target){
                cnt++;
            } else{
                cnt--;
            }
        }
        return target;
    }
}
