package com;

/**
 * 21. 合并两个有序链表-方法二：递归
 */
public class Solution0021_2 {
    public static void main(String[] args) {

    }
    public class ListNode{
        int val;
        Solution0021_1.ListNode next;
        ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, Solution0021_1.ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

