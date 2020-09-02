package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

/*707. 设计链表
* */
public class code707_MyLinkedList {
    int size;
    ListNode head;
    /*gouzao*/
    public code707_MyLinkedList(){
        size=0;
        head = new ListNode(0);
    }

    public int get(int index){
        if(index < 0 || index >= size) return -1;
        ListNode cur = head;
        for(int i=0;i<=index;i++){
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int value){
        addAtIndex(0,value);
    }

    public void addAtTail(int value){
        addAtIndex(size,value);
    }

    public void addAtIndex(int index, int value){
        if(index > size) return;
        if(index < 0 ) index = 0;
        ListNode cur = head;
        for(int i=0;i<index;i++){ // 移动到要添加的index之前的一个节点
            cur = cur.next;
        }
        // 要添加的节点
        ListNode targetNode = new ListNode(value);
        targetNode.next  = cur.next;
        cur.next = targetNode;
        // 添加了一位
        size++;
    }

    public void deleteAtIndex(int index){
        if(index < 0 || index >= size){
            return;
        }
        ListNode cur = head;
        for(int i=0;i<index;i++){ // 移动到要删除的index之前的一个节点
            cur = cur.next;
        }
        cur.next = cur.next.next;
        size--;
    }

}
