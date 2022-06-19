package com;

/**
 * 9. 回文数-方法二：数字反转
 */
public class Solution0009_3 {
    public static boolean isPalindrome(int x) {
        /*方法二：数字反转*/
        if((x<0)||(x%10==0&&x!=0)){ //当x为负数时，x不是回文数；如果数字的最后一位是0，只有0满足条件
            return false;
        }
        int revertedNumber = 0;
        while(x>revertedNumber){    //迭代，获得反转一半的数字
            revertedNumber=revertedNumber*10+x%10;
            x=x/10;
        }
        return x==revertedNumber||x==revertedNumber/10;//偶/奇数
    }
}
