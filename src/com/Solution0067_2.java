package com;

/**
 * 67. 二进制求和-方法二：模拟
 */
public class Solution0067_2 {
    public String addBinary(String a, String b) {
        int len = Math.max(a.length(), b.length());
        StringBuffer stringBuffer = new StringBuffer();/*StringBuffer可变长*/
        int carry = 0;/*进位*/
        for (int i = 0; i < len ; i++) {
            int num1 = i < a.length() ? a.charAt(a.length()-1-i)-'0' : 0 ;/*有效位的值*/
            int num2 = i < b.length() ? b.charAt(b.length()-1-i)-'0' : 0 ;
            int temp = (num1 + num2 + carry) % 2 + '0';/*逢二进一*/
            stringBuffer.append((char)temp);/*可变长-添加元素*/
            carry = (num1 + num2 + carry) / 2;/*修改进位*/
        }
        if (carry > 0){/*根据最后的carry判断是否需要添加一位*/
            stringBuffer.append('1');
        }
        stringBuffer.reverse();/*逆置*/
        return stringBuffer.toString();
    }
}
