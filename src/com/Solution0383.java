package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 383. 赎金信
 */
public class Solution0383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) {/*将String转化为char[]数组,使用foreach进行遍历，减少charAt的时间消耗*/
            count[c-'a']++;
        }
//        for (int i = 0; i < magazine.length(); i++) {
//            count[magazine.charAt(i)-'a']++;
//        }
        for (char c : ransomNote.toCharArray()) {
            count[c-'a']--;
            if (count[c-'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
