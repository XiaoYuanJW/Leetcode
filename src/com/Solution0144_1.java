package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历-方法一：递归
 */
public class Solution0144_1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();/*输出列表*/
        preorder(root, list);
        return list;
    }

    public void preorder(TreeNode root, List list){/*递归函数*/
        if (root != null){
            list.add(root.val);
            preorder(root.left, list);
            preorder(root.right, list);
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
