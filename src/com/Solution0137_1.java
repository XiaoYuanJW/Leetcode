package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *  137. 只出现一次的数字 II 方法一：利用哈希表实现
 * Created by YuanJW on 2022/6/22.
 */
public class Solution0137_1 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = 0;
        // entrySet.iterator()迭代Map类集合KV
//        Iterator it = map.entrySet().iterator();
//        while (it.hasNext()) {
//            Map.Entry entry = (Map.Entry) it.next();
//            if (Integer.parseInt(String.valueOf(entry.getValue()))== 1) {
//                ans = Integer.parseInt(String.valueOf(entry.getKey()));
//            }
//        }
//        return ans;
        // entrySet遍历Map类集合KV
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                ans = entry.getKey();
            }
        }
        return ans;
    }
}
