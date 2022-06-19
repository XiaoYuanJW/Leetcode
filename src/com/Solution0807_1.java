package com;

/**
 * 807. 保持城市天际线-方法一：贪心
 * Created by YuanJW on 2022/5/19.
 */
public class Solution0807_1 {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int len = grid.length;
        int[] rowMax = new int[len];/*行最大值数组*/
        int[] colMax = new int[len];/*列最大值数组*/
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                //TODO:分别求出行和列的最大值
            }
        }
        int ans = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                //TODO:求出增量
            }
        }
        return ans;
    }
}
