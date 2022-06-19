package com;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 136. 只出现一次的数字-方法二：集合-利用其余元素只出现两次的特性-集合里不存在加入元素，集合里存在去除元素
 */
public class Solution0136_2 {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for (Integer num : nums) {
            if (set.contains(num)){
                set.remove(num);

            } else {
                set.add(num);
            }
        }
        for (Integer i : set) {
            ans = i;
        }
        return ans;
    }
}
