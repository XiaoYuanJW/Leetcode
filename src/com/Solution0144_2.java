package com;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * 144. 二叉树的前序遍历-方法一：迭代-栈
 */
public class Solution0144_2 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();/*输出结果列表*/
        if (root == null){/*数为空直接返回*/
            return list;
        }
        Deque<TreeNode> stack = new LinkedList<TreeNode>();/*栈模拟递归的过程*/
        while (root != null || !stack.isEmpty()){
            while (root != null){/*当左下节点为空时*/
                list.add(root.val);
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();/*从栈中退出栈顶节点，寻找它的右节点*/
            root = root.right;
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
