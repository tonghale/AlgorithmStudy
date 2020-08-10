package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

import javax.security.auth.kerberos.KerberosPrincipal;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/*分段反转链表  每K个链表进行一次反转*/
public class code25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k<=1){
            return head;
        }

        ListNode result = new ListNode(0);
        result.next = head;

        ListNode kPre = result;
        ListNode kNext = null;

        ListNode firstNode = null;
        ListNode lastNode = null;

        while (head!=null) {

            firstNode = head;
            lastNode = head;

            for (int i = 1; i < k; i++) { // 往后移动K次
                lastNode = lastNode.next;
                if (lastNode == null) {  // 后面不够K次了
                    return result.next;
                }
            }
            kNext = lastNode.next;

            ArrayList<ListNode> reverseList = reverse(firstNode, k);
            kPre.next = reverseList.get(0);
            reverseList.get(1).next = kNext;

            kPre = reverseList.get(1);
            head = kNext;

        }
        return result.next;
    }

    /*返回反转后  de  首尾节点*/
    public ArrayList<ListNode> reverse(ListNode firstNode, int size){
        int count = 1;
        ListNode cur = firstNode;
        ListNode pre = null;
        ListNode next = null;
        while (count <= size) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
            count++;
        }
        ArrayList<ListNode> result = new ArrayList<>();
        result.add(pre);
        result.add(firstNode);
        return result;
    }
}
