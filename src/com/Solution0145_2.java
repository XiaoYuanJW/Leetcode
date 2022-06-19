package com;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历-方法二：迭代-栈
 */
public class Solution0145_2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if (root == null){/*树为空*/
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();/*栈模拟递归过程*/
        TreeNode prev = null;/*记录上一个访问的节点*/
        while (root != null || !stack.isEmpty()){/*迭代条件*/
            while(root != null){/*找到最左节点*/
                stack.push(root);/*入栈*/
                root = root.left;/*向左延申*/
            }
            root = stack.pop();/*栈顶元素出栈*/
            if (root.right == null || root.right == prev){
                list.add(root.val);
                prev = root;
                root = null;
            } else {
                stack.push(root);
                root = root.right;
            }
        }
        return list;
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
