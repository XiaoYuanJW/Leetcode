package com;

/**
 * 35. 搜索插入位置-方法一：折半查找（我的初始版本-内存消耗小-利于理解）
 */
public class Solution0035_1 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;/*数组长度*/
        int left = 0, right = len - 1;/*折半查找-左右指针*/
        while (left <= right) { /*循环跳出条件-left > right*/
            int mid = (left + right)/2;/*每次循环的中间位置*/
            if (target == nums[mid]) {/*遇到相等的直接返回*/
                return mid;
            } else if (target < nums[mid]) {/*左半部分*/
                right = mid - 1;
            } else {/*右半部分*/
                left = mid + 1;
            }
        }
        return left;
    }
}
