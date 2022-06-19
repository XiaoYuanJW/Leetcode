package com;

import com.object.TreeNode;

/**
 * 112. 路径总和-方法一：递归（大问题转化为小问题：是否存在从当前节点root到叶子节点的路径和为sum->是否存在从当前节点的子节点到叶子的路径和为sum-val）
 */
public class Solution0112_1 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {/*树为空的情况*/
            return false;
        }
        if (root.left == null && root.right == null) {/*root为叶子节点的情况*/
            return root.val == targetSum;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
