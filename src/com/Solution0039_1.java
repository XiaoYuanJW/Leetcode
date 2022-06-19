package com;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YuanJW on 2022/6/9.
 * 39. 组合总和-方法一：搜索回溯（寻找所有可行解题的通解）
 */
public class Solution0039_1 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();  //组合列表
        List<Integer> combine = new ArrayList<>();  //组合
        dfs(candidates, target, ans, combine, 0);
        return ans;
    }
    //递归
    public static void dfs(int[] candidates, /*整数组合*/
                           int target, /*目标整数*/
                           List<List<Integer>> ans, /*组合列表*/
                           List<Integer> combine, /*组合*/
                           int index/*索引*/) {
        if (index == candidates.length) {    //index超出
            return;
        }
        if (target == 0) {
            //为什么使用new ArrayList<Integer>(combine)
            ans.add(new ArrayList<Integer>(combine));
            return;
        }
        dfs(candidates, target, ans, combine, index + 1);
        if (target - candidates[index] >= 0) {
            combine.add(candidates[index]);
            dfs(candidates, target - candidates[index], ans, combine, index);
            combine.remove(combine.size()-1);
        }
    }
}
