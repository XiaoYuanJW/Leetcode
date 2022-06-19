package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历-方法一：递归
 */
public class Solution0094_1 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return list;
    }

    /*中序遍历方法*/
    public void inorder(TreeNode root, List list){
        if (root != null) {
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right, list);
        }
    }

    /*二叉树的定义*/
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode() {
        }
        public TreeNode(int val) {
            this.val = val;
        }
        public TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
