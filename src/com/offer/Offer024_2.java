package com.offer;

import com.object.ListNode;

/**
 * 剑指 Offer 24. 反转链表-方法二：递归
 * Created by YuanJW on 2022/6/17.
 */
public class Offer024_2 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 链表已经翻转的部分
        ListNode newHead = reverseList(head.next);
        // 处理剩余部分逻辑
        head.next.next = head;/*head的下一个节点指向head*/
        head.next = null;
        return newHead;
    }
}
