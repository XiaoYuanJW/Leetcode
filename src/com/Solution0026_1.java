package com;

/**
 * 26. 删除有序数组中的重复项-方法一：双指针
 */
public class Solution0026_1 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0){
            return 0;
        }
        int slow = 1, fast = 1;/*双指针,slow-加入位置，fast-扫描位置*/
        while (fast < len){
            if (nums[fast] != nums[slow-1]){
                nums[slow++] = nums[fast];
            }
            fast++;
        }
        return slow;
    }
}
