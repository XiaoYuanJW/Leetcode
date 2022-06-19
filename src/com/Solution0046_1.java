package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 46. 全排列-方法一：回溯法
 * Created by YuanJW on 2022/6/12.
 */
public class Solution0046_1 {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        backTrack(list, 0, ans);
        return ans;
    }

    /**
     * 回溯法
     * @param list 目标排列
     * @param index 排序索引
     * @param ans 目标全排列列表
     */
    public void backTrack(List<Integer> list, int index, List<List<Integer>> ans){
        // 索引完毕-递归出口
        if (index == list.size()) {
            ans.add(new ArrayList<>(list));
        }
        for (int i = index; i < list.size(); i++) {
            // 枚举
            Collections.swap(list, index, i);
            // 递归下一层
            backTrack(list, index + 1, ans);
            // 回溯
            Collections.swap(list, index, i);
        }
    }
}
