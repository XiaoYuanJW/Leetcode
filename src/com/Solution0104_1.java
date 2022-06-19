package com;

/**
 * 104. 二叉树的最大深度-方法一：深度优先搜索
 */
public class Solution0104_1 {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else {
            /*左子树和右子树的最大深度l和r，二叉树的最大深度是max(l,r)+1*/
            return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
        }
    }

    /*二叉树的定义*/
    public class TreeNode {
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
