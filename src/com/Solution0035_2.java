package com;

/**
 * 35. 搜索插入位置-方法二：折半查找（官方版）
 */
public class Solution0035_2 {
    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;/*初始左右指针*/
        int index = len;/*目标值-没有修改值说明target插入位置在第len位*/
        while (left <= right) {/*折半查找循环条件，当left>right时跳出循环*/
            int mid = (right + left)/2;/*每次循环的中间位置（折半点）*/
            if (nums[mid] >= target) {
                index = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return index;
    }
}
