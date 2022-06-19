package com;

/**
 * 11. 盛最多水的容器
 */
public class Solution0011 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
//                if(max < Math.min(height[i],height[j])*(j-i)){
//                    max = Math.min(height[i],height[j])*(j-i);
//                }
                max = Math.max(max, Math.min(height[i], height[j])*(j-i));
            }
        }
        return max;
    }
}
