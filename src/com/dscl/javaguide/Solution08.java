package com.dscl.javaguide;

import java.util.Stack;

/*输入两个数组，判断是否满足入栈和出栈的顺序*/
public class Solution08 {

    public boolean isPopOrder(int[] push,int[] pop){
        if(push.length == 0 || pop.length==0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();

        int j = 0;// 标识 pop数组的下标
        for(int i=0;i<push.length;i++){
            stack.push(push[i]);
            /*栈顶元素同pop匹配上了，则挨个弹出，直到栈顶元素和pop下标不相等*/
            while (!stack.isEmpty() && stack.peek() == pop[j]){
                stack.pop();
                j++;
            }
        }
        /*如果栈内元素为空，则表示正好满足出栈顺序*/
        return stack.isEmpty();
    }
}
