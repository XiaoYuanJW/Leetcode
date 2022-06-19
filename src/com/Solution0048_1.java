package com;

/**
 * 48.旋转图像-方法一：辅助数组
 */
public class Solution0048_1 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        int[][] ans = new int[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                ans[j][len - i - 1] = matrix[i][j];
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                matrix[i][j] = ans[i][j];
            }
        }
    }
}
