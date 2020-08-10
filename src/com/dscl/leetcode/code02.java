package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

/*两数相加  链表*/
public class code02 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q = l2;
        ListNode dummyHead = new ListNode(0); //哑结点 主要用于跟踪
        ListNode res = dummyHead; //初始化结果链表
        int carry = 0;
        while (p!=null || q!=null){
            int x = p!=null ? p.val : 0;
            int y = q!=null ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10; //更新进位数
            res.next = new ListNode(sum%10);
            res = res.next;
            if(p!=null) p=p.next;
            if(q!=null) q=q.next;
        }
        if(carry > 0){
            res.next=new ListNode(carry);
        }
        return dummyHead.next;

    }

}
