package com;

/**
 * 48. 旋转图像-方法二：翻转代替旋转
 * Created by YuanJW on 2022/6/15.
 */
public class Solution0048_2 {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
        // 水平翻转
        for (int i = 0; i < len/2; i++) {
            for (int j = 0; j < len; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[len-i-1][j];
                matrix[len-i-1][j] = temp;
            }
        }
        // 对角线翻转
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
