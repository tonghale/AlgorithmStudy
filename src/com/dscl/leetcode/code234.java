package com.dscl.leetcode;

/*234. 回文链表
*请判断一个链表是否为回文链表。
 * */

import com.dscl.publicBasicModel.ListNode;

public class code234 {
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return traverse(head);
    }
    public boolean traverse(ListNode right){
        if(right == null) return true;
        boolean res = traverse(right.next);
        res = res && (right.val == left.val);
        left = left.next;
        return res;
    }
}
