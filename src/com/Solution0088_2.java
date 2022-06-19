package com;

import java.util.Arrays;

/**
 * 88. 合并两个有序数组-方法二：直接合并后排序
 */
public class Solution0088_2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        System.arraycopy(nums2, 0, nums1, m, n)/*合并*/;
        Arrays.sort(nums1)/*排序-快速排序*/;
    }
}
