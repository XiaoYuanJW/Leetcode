package com;

/**
 * 27. 移除元素-方法一：双指针
 */
public class Solution0027_1 {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0, j = 0;/*双指针：i：赋值位置；j：扫描指针*/
        while (j < len) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
            j++;
        }
        return i;
    }
}
