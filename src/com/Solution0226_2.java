package com;

import com.object.TreeNode;

/**
 * 226. 翻转二叉树-方法一：递归-从下到上-从叶子节点到根节点的左右子树
 */
public class Solution0226_2 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {/*当树为空时直接返回空*/
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
