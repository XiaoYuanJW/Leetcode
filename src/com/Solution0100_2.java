package com;

/**
 * 100. 相同的树-方法二：广度优先算法
 */
public class Solution0100_2 {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        //TODO
//    }

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
