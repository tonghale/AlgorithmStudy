package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

import java.util.PriorityQueue;

/* 23. 合并K个升序链表
* 给你一个链表数组，每个链表都已经按升序排列。
请你将所有链表合并到一个升序链表中，返回合并后的链表。
* */
public class code23 {

    /* 每次取每个链表的第一个节点进行比较，记录最小节点，串联到结果链表中*/
    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        while (true){
            ListNode minNode = null;
            int minIndex = -1;// 标识是哪个链表中拿到了最小值，并使其往下移动
            for(int i=0;i<len;i++){
                // 如果某个链表已经为空，则忽略；
                if(lists[i] == null){
                    continue;
                }
                if(lists[i].val < minNode.val || minNode == null){
                    minNode = lists[i];
                    minIndex = i;
                }
            }
            if(minIndex == -1){
                break;
            }
            cur.next = minNode;
            cur = cur.next;
            lists[minIndex] = lists[minIndex].next;
        }
        return dummyHead.next;
    }

    /*使用堆排序的方式，对每个链表中的首节点进行排序。借助优先队列*/
    public ListNode mergeKLists2(ListNode[] lists){
        PriorityQueue<ListNode> priorityList = new PriorityQueue<>((v1,v2)->(v1.val - v2.val));
        int len = lists.length;
        ListNode dummyNode = new ListNode(0);
        ListNode cur = dummyNode;
        for(int i=0;i<len;i++){
            priorityList.add(lists[i]);
        }

        while (!priorityList.isEmpty()){
            ListNode minNode = priorityList.poll();
            cur.next = minNode;
            cur = cur.next;
            if(minNode.next != null){
                priorityList.add(minNode.next);
            }
        }
        return dummyNode.next;
    }
}
