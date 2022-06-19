package com;

import java.lang.reflect.Constructor;

/**
 *108. 将有序数组转换为二叉搜索树
 */
public class Solution0108 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {
        }
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return Construct(nums,0,nums.length-1);
    }

    public TreeNode Construct(int[] nums, int left, int right){
        /*递归终止条件*/
        if(left > right){
            return null;
        }
        /*每次选择中间位置的左边数字作为根节点*/
        int mid = (left + right)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = Construct(nums,left,mid-1);
        root.right = Construct(nums, mid+1, right);
        return root;
    }
}
