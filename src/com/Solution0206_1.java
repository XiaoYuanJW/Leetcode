package com;

/**
 * 206. 反转链表-方法一：迭代
 */
public class Solution0206_1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;/*存储前一个节点*/
        ListNode curr = head;/*当前修改指针的节点*/
        while(curr != null){
            ListNode next = curr.next;/*存储当前节点的后一个节点*/
            curr.next = prev;
            prev = curr;/*顺序不能交换*/
            curr = next;
        }
        return prev;
    }
    public class ListNode {
        int val;
        ListNode next;
        public ListNode() {
        }
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
