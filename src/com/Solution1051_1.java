package com;

import java.util.Arrays;

/**
 * 1051. 高度检查器-方法一：基于比较的排序
 * Created by YuanJW on 2022/6/13.
 */
public class Solution1051_1 {
        public int heightChecker(int[] heights) {
            int cnt = 0;
            int[] expected = new int[heights.length];
            // 复制
            System.arraycopy(heights, 0, expected, 0, heights.length);
            // 排序
            Arrays.sort(heights);
            // 比较计数
            for (int i = 0; i < heights.length; i++) {
                if (expected[i] != heights[i]) {
                    cnt++;
                }
            }
            return cnt;
        }
}
