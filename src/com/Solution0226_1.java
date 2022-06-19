package com;

import com.object.TreeNode;

/**
 * 226. 翻转二叉树-方法一：递归-从上到下
 */
public class Solution0226_1 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        } else {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertTree(root.right);
            invertTree(root.left);
        }
        return root;
    }
}
