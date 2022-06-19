package com;

import java.util.HashMap;

/**
 * 1. 两数之和-方法一：暴力枚举
 */
public class Solution0001_1 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;  //数组长度
        for(int i=0;i<len-1;i++){   //注意len-1
            for(int j=i+1;j<len;j++){   //注意j=i+1，之前的元素不需要再匹配;j<len
                if(nums[i]+nums[j]==target){
                    return new int[]{i, j}; //返回int[]
                }
            }
        }
        return new int[0];	//返回异常或空
    }
}
