package com;

/**
 * 5. 最长回文子串-方法二：中心扩散法
 */
public class Solution0005_2 {
    public String longestPalindrome(String s) {
        int len = s.length();/*字符串的长度*/
        if (len < 2){/*字符串长度*/
            return s;
        }
        int maxLen = 1;/*最长回文子串长度（注意：这里的初始值是1-回文子串长度最小为）*/
        int begin = 0;/*最长回文子串起点位置*/
        char[] charArray = s.toCharArray();/*使用s.charAt(i)每次都会检查数组下标越界-转换成字符串数组*/
        for (int i = 0; i < len - 1; i++) {
            int oddLen = expandAroundCenter(charArray, i, i);/*奇数*/
            int evenLen = expandAroundCenter(charArray, i, i+1);/*偶数*/
            int curLen = Math.max(oddLen, evenLen);
            if(curLen > maxLen){
                maxLen = curLen;
                begin = i - (maxLen - 1)/2;/*奇偶起点*/
            }
        }
        return s.substring(begin, begin + maxLen);
    }
    /*中心扩散寻找最大回文字串*/
    public int expandAroundCenter(char[] charArray, int left, int right){
        /*当left==right时，回文中心是一个字符，回文串长度是奇数*/
        /*当right=left+1时，回文中心是两个字符，回文串长度是偶数*/
        while(left > -1 && right < charArray.length) {/*扩散跳出的条件*/
            if (charArray[left] == charArray[right]) {
                left--;
                right++;
            }else{
                break;
            }
        }
        return right-left-1;/*回文字串长度*/
    }
}
