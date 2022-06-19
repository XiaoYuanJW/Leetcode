package com;

import java.util.Deque;
import java.util.LinkedList;

public class Solution0101_2 {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }
    public boolean check (TreeNode p, TreeNode q){
        Deque<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(p);
        queue.offer(q);
        while (!queue.isEmpty()){
            p = queue.poll();
            q = queue.poll();
            if (p == null && q == null) {
                continue;
            } else if ((p == null || q == null)) {
                return false;
            } else if (p.val != q.val){
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.right);
            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
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
