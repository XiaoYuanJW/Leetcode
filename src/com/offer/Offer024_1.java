package com.offer;

import com.object.ListNode;

/**
 * 剑指 Offer 24. 反转链表-方法一：迭代
 * Created by YuanJW on 2022/6/17.
 */
public class Offer024_1 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;/*记录处理节点前节点：记录指向*/
        ListNode curr = head;/*记录当前处理节点：改变指针*/
        while (curr!= null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // 注意返回的是prev
        return prev;
    }
}
