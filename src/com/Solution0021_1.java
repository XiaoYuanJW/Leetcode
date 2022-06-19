package com;

/**
 * 21. 合并两个有序链表-方法一：迭代
 */
public class Solution0021_1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prehead = new ListNode(-1);/*合并链表头结点*/
        ListNode prev = prehead;/*移动指针-指向合并链表尾结点*/
        while (list1 != null && list2 != null) {/*循环条件*/
            if (list1.val <= list2.val) {/*找值小的节点*/
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }
        if (list1 != null){/*合并剩余部分-合并链表尾指针指向未合并的链表*/
            prev.next = list1;
        }
        if (list2 != null){
            prev.next = list2;
        }
//        prev.next = list1 == null ? list2 : list1;/*方法二*/
        return prehead.next;
    }
    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
