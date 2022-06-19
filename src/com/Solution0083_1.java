package com;

/**
 * 83. 删除排序链表中的重复元素-方法一：一次遍历
 */
public class Solution0083_1 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {/*当链表为空时，返回空链表-这里判断防止p.next报错*/
            return head;
        }
        ListNode p = head;/*遍历指针*/
        while (p.next != null) {/*遍历条件*/
            if (p.next.val == p.val) {/*相同-移除p.next*/
                p.next = p.next.next;
            } else {/*不同-p指针后移*/
                p = p.next;
            }
        }
        return head;
    }
    /*链表节点定义*/
    public class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
