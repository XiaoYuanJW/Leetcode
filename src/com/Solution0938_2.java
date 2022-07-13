package com;

import com.object.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 938. 二叉搜索树的范围和-方法二：广度优先搜索
 * Created by YuanJW on 2022/7/12.
 */
public class Solution0938_2 {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum = 0;    // 节点之和
        Queue<TreeNode> q = new LinkedList();   // 辅助队列：先进先出
        q.offer(root);  // 头结点入队
        while (!q.isEmpty()) {  // 当队列不为空时
            TreeNode node = q.poll();  // 头结点出队
            // 队列中空节点的处理
            if (node == null) {
                continue;
            }
            // 三种不同情况的处理方式
            if (node.val < low) {
                q.offer(node.right);
            } else if (node.val > high) {
                q.offer(node.left);
            } else {
                sum += node.val;
                q.offer(node.left);
                q.offer(node.right);
            }
        }
        return sum;
    }
}
