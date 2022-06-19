package com;

import java.util.HashMap;

/**
 * 1. 两数之和-方法二：查找表法（哈希表）
 */
public class Solution0001_2 {
    public int[] twoSum(int[] nums, int target) {
        int len = nums.length;  //数组长度
        HashMap<Integer,Integer> hashMap = new HashMap<>(len-1); //定义哈希表，初始容量
        hashMap.put(nums[0],0); //第一个值hash表中没有配对值，直接存放
        for(int i=1;i<len;i++){ //注意i=1
            int another = target-nums[i];   //获取配对
            if(hashMap.containsKey(another)){   //hash表中找到配对值
                return new int[]{hashMap.get(another),i};   //返回i以及配对值的关键字
            }
            hashMap.put(nums[i], i);    //没有配对，存放到哈希表，i+1；
        }
        return new int[0];	//返回异常或空
    }
}
