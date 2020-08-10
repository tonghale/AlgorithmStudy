package com.dscl.jianzhioffer;
/*找到倒数第K个节点*/
import com.dscl.publicBasicModel.ListNode;

public class Offer22 {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode p = head;
        ListNode q = head;
        int count = 0;
        while (p!=null){
            if(p.next!=null){
                p = p.next;
            }
            count++;
            if (count >= k ){
                q = q.next;
            }
        }
        return q;
    }
}
