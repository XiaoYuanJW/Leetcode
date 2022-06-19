package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YuanJW on 2022/5/24.
 */
public class Solution0015_1 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        if (nums.length <= 2){
            return ans;
        }
        Arrays.sort(nums);/*排序-时间复杂度-O(nlogn)*/
        int i = 0;
        while (nums[i] <= 0 && i < nums.length - 2) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                if (nums[left] + nums[right] == -nums[i]) {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left-1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                } else if (nums[left] + nums[right] < -nums[i]) {
                    left++;
                    while (left < right && nums[left] == nums[left--]) {
                        left++;
                    }
                } else {
                    right--;
                    while (left < right && nums[right] == nums[right+1]) {
                        right--;
                    }
                }
            }
            i++;
            while (i > 0 && nums[i] == nums[i-1]){
                i++;
            }
        }
        return ans;
    }
}
