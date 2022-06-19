package com.interview;

import com.object.ListNode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution02_08_1 {
    public ListNode detectCycle(ListNode head) {
        ListNode pos = head;
        Set<ListNode> visited = new HashSet<ListNode>();
        while (pos != null){
            if (visited.contains(pos)){
                return pos;
            } else {
                visited.add(pos);
            }
            pos = pos.next;
        }
        return null;
    }
}
