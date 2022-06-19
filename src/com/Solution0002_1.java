package com;

/**
 * 2. 两数相加-方法一：初等数学
 */
public class Solution0002_1 {
     public static class ListNode {
         int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode head = null, tail = null/*新建链表的头尾指针*/;
        int carry = 0/*上一位的进位*/;
        /*逐步相加：初等数学*/
        while(l1 != null && l2 != null){
            int sum = l1.val + l2.val + carry;
            if(head == null){
                head = tail = new ListNode(sum%10);
            } else {
                tail.next = new ListNode(sum%10);
                tail = tail.next;
            }
            carry = sum/10;
            l1 = l1.next;
            l2 = l2.next;
        }
        /*处理剩余部分（注意进位）*/
        while(l1 != null){
            int sum = l1.val+carry;
            tail.next = new ListNode(sum%10);
            tail = tail.next;
            l1 = l1.next;
            carry = sum/10;
        }
        while(l2 != null){
            int sum = l2.val+carry;
            tail.next  = new ListNode(sum%10);
            tail= tail.next;
            l2 = l2.next;
            carry = sum/10;
        }
        /*最后有可能是进位*/
        if(carry > 0){
            tail.next = new ListNode(carry);
            tail= tail.next;
        }
         return head;
    }
}
