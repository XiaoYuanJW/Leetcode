package com;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. 无重复字符的最长子串-方法一：滑动窗口
 */
public class Solution0003_1 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<Character>();/*哈希集合-记录字符是否重复*/
        int len = s.length();/*数组长度*/
        int ans = 0;/*记录最大长度*/
        int right = 0;/*右指针*/
        int left = 0;/*左指针*/
        while (left<len){
            while (right < len && !set.contains(s.charAt(right))) {/*右指针右移条件*/
                set.add(s.charAt(right));
                right++;
            }
            ans = Math.max(ans, right-left);/*更新最大长度*/
            set.remove(s.charAt(left++));/*集合移除最左的元素-左指针右移*/
        }
        return ans;
    }
}
