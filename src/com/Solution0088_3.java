package com;

/**
 * 88. 合并两个有序数组-方法三：逆向双指针
 */
public class Solution0088_3 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1, p2 = n-1;
        /*后序排序，将大的先放到nums1,减少空间复杂度*/
        while(p1 >= 0 && p2 >= 0){
            if (nums1[p1] <= nums2[p2]){
                nums1[p1+p2+1] = nums2[p2--];
            } else {
                nums1[p1+p2+1] = nums1[p1--];
            }
        }
        while(p2 >= 0){
            nums1[p2] = nums2[p2--];
        }
    }
}
