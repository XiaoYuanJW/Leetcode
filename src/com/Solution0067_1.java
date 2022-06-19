package com;

/**
 * 67. 二进制求和-方法一：二进制转十进制
 */
public class Solution0067_1 {
    public String addBinary(String a, String b) {
        int ans = Integer.parseInt(a, 2) + Integer.parseInt(b, 2);/*二进制转十进制后相加*/
        return Integer.toBinaryString(ans);/*以2为基返回整数参数的字符串表示形式，表示为无符号整数-十进制转二进制*/
    }
}
