package com.offer;

/**
 * Created by YuanJW on 2022/6/3.
 * 剑指 Offer II 003. 前 n 个数字二进制中 1 的个数
 * 方法一：内置函数 Java Integer.bitCount
 */
public class Offer_II_003_1 {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }
}
