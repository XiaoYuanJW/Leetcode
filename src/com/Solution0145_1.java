package com;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历-方法一：递归
 */
public class Solution0145_1 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        postorder(root,list);
        return list;
    }

    public void postorder(TreeNode root,List<Integer> list) {/*遍历方法*/
        if (root != null){/*当root不为空时*/
            postorder(root.left, list);/*递归遍历root节点的左子树*/
            postorder(root.right, list);/*递归遍历root节点的右子树*/
            list.add(root.val);/*最后将root节点的值加入list*/
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
