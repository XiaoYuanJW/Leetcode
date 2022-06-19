package com;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. 存在重复元素：集合-不重复性
 */
public class Solution0217_1 {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {/*迭代*/
            if (!set.add(num)){/*重复添加失败-存在重复元素*/
                return true;
            }
        }
        return false;
    }
}
