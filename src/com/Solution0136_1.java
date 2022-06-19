package com;

import java.util.HashMap;

/**
 * 136. 只出现一次的数字-方法一：利用Hash表
 */
public class Solution0136_1 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();/*Hash键值对：键-元素的值；值：元素出现次数*/
        for (Integer num : nums) {/*迭代*/
            int count = hashMap.get(num) == null ? 1 : hashMap.get(num) + 1;/*Integer引用数据类型的默认值为null*/
            hashMap.put(num, count);
        }
        for (Integer num : hashMap.keySet()) {/*遍历hashMap的键*/
            if (hashMap.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}
