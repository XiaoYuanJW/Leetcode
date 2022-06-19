package com;

public class Solution0101_1 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    public boolean check (TreeNode p, TreeNode q){
        if (p == null && q == null) {/*两者为空的情况*/
            return true;
        } else if (p == null || q == null) {/*两者有一为空的情况*/
            return false;
        } else {/*两者不空的情况*/
            return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
        }
    }
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
