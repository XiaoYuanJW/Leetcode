package com;

import java.util.HashMap;
import java.util.Map;

/**
 * 169.多数元素-方法二：哈希表法
 */
public class Solution0169_2 {
    public int majorityElement(int[] nums) {
        /*哈希映射（键-数组元素的值；值-元素出现次数）*/
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        /*循环遍历遍历-每个元素加入哈希映射*/
        for (int num : nums) {
            if (!counts.containsKey(num)){
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num)+1);
            }
        }
        /*返回值最大的键*/
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (maxEntry == null || maxEntry.getValue() < entry.getValue()) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }
}
