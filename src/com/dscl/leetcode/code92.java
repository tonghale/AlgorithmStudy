package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

/*反转链表 中特定长度*/
public class code92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = head;
        ListNode mPre = null;
        ListNode mNode = null;

        ListNode result = head; // 用于存放返回结果头
        int count = 0; //用于判断链表位置
        if(n<=m){
            return result;
        }

        while (cur != null){

            count++;
            if(count == m-1){
                mPre = cur; // 获取到翻转子串的前一个节点；
            }

            // 进入要翻转的节点了
            if(count >= m && count<=n){

                if(count == m){
                    mNode = cur; // 获得要移动到后面的节点
                }

                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
                if(count == n ){
                    if(mPre == null){   // 说明m=1,第一个节点要换到后面，当前节点即为反转后的头节点；
                        result = pre;
                    }else {         // 证明翻转后该节点需要有前置节点进行连接。
                        mPre.next = pre;
                    }

                    mNode.next = cur;  //现在cur 存放的是 第n+1个节点
                    break;
                }
            }else {
                cur = cur.next;
            }
        }
        return result;
    }

}
