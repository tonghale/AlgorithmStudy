package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

/*给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。*/
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
