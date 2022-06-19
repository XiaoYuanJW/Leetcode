package com;

/**
 * 66. 加一-方法一：找出最长的后缀9
 */
public class Solution0066_1 {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        /*逆序遍历*/
        for (int i = len - 1 ; i >= 0 ; i-- ) {
            /*数组值加一*/
            digits[i] = digits[i] + 1 ;
            if (digits[i] == 10) {
                digits[i] = 0;
            } else {/*无需进位则直接返回结果*/
                return digits;
            }
        }
        /*digits中所有的元素均是9*/
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
