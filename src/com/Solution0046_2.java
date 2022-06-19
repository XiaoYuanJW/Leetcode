package com;

/**
 * 46. 全排列-方法二： 状态数组
 * Created by YuanJW on 2022/6/15.
 */
public class Solution0046_2 {
    //    private List<List<Integer>> lists = new ArrayList<>();
    //
    //    public List<List<Integer>> permute(int[] nums) {
    //        int n = nums.length;
    //        List<Integer> list = new ArrayList<>(n);
    //        boolean[] used = new boolean[n];
    //        int count = 0;
    //        backtrace(list, used, count, nums);
    //        return lists;
    //    }
    //
    //    public void backtrace(List<Integer> list, boolean[] used, int count, int[] nums) {
    //        if (count == nums.length) {
    //            lists.add(new ArrayList(list));
    //            return;
    //        }
    //        for (int i = 0; i < used.length; i++) {
    //            if (!used[i]) {
    //                list.add(nums[i]);
    //                used[i] = true;
    //                backtrace(list, used, count + 1, nums);
    //                list.remove(list.size() - 1);
    //                used[i] = false;
    //            }
    //        }
}
