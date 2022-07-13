package com;

import com.object.TreeNode;

/**
 * 938. 二叉搜索树的范围和-方法一：深度优先搜索（递归）
 * Created by YuanJW on 2022/7/12.
 */
public class Solution0938_1 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        // 树为空
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.right, low, high) + rangeSumBST(root.left, low, high);
    }
}
