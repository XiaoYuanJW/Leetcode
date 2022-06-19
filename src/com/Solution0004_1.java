package com;

/**
 * 4. 寻找两个正序数组的中位数-方法一
 */
public class Solution0004_1 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;/*数组一长度*/
        int len2 = nums2.length;/*数组二长度*/
        int[] nums = new int[len1 + len2];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                nums[k++] = nums[i++];
            } else {
                nums[k++] = nums[j++];
            }
        }
        while(i < nums1.length) {
            nums[k++] = nums[i++];
        }
        while(j < nums2.length) {
            nums[k++] = nums[j++];
        }
        int tmp = (len1 + len2)%2;
        double ans = 0.0;
        if(tmp == 0){/*偶数个*/
            ans = nums[tmp];
        } else {/*奇数个*/
            ans = (nums[tmp] + nums[tmp+1])/2;
        }
        return ans;
    }
}
