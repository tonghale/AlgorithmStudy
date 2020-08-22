package com.dscl.leetcode;

import com.dscl.publicBasicModel.ListNode;

import java.util.Random;

/*382. 链表随机节点
给定一个单链表，随机选择链表的一个节点，并返回相应的节点值。保证每个节点被选的概率一样。
* */
public class code382 {

    /** @param head The linked list's head.
    Note that the head is guaranteed to be not null, so it contains at least one node. */
    public code382(ListNode head) {

    }

    /** Returns a random node's value. */
    public static int getRandom() {
        Random r = new Random();

        for(int i = 0;i<=10;i++){
            System.out.println(r.nextInt(10));
        }
        return 0;
    }

    public static void main(String[] args){
        getRandom();
    }

}
