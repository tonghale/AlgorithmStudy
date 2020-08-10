package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

public class code19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = head;
        ListNode q = head;
        ListNode tmp = head;
        int count = 0;
        boolean sign = false;
        while (p!=null || q!=null){
            if(p == null){
                sign = true;
            }
            if(sign == false){
                p = p.next;
            }
            count++;

            if (count >= n+1 ){
                q = q.next;
            }
            if(sign == true){
                q.next = q.next.next;
                break;
            }
        }
        return head;
    }
}
