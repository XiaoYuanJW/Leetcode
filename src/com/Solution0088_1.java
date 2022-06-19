package com;

/**
 * 88. 合并两个有序数组-方法一：双指针
 */
public class Solution0088_1 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0/*两个指针分别指向nums1和nums2*/;
        int[] sorted = new int[m+n]/*定义长度为m+n的整型数组存储结果（空间复杂度换取时间复杂度）*/;
        while(i < m && j < n){/*两个只要有一个扫描结束，执行结束*/
            if(nums1[i] < nums2[j]) {/*比较*/
                sorted[i+j] = nums1[i++];
            } else {
                sorted[i+j] = nums2[j++];
            }
        }
        /*处理剩余的数组*/
        while (i < m){
            sorted[i+j] = nums1[i++];
        }
        while (j < n) {
            sorted[i+j] = nums2[j++];
        }
        /*将结果复制到nums1*/
        for (int k = 0; k < m+n; k++) {
            nums1[k] = sorted[k];
        }
    }
}
