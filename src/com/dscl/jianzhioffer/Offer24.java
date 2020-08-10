package com.dscl.jianzhioffer;

import com.dscl.publicBasicModel.ListNode;

/*翻转链表*/
public class Offer24 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = head;
        while (cur != null){
            next = cur.next; //记录后一个节点
            cur.next= pre;
            pre = cur; //记录当前节点
            cur = next;
        }
        return pre;
    }
}
