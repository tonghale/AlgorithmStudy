package com.dscl.javaguide;

import java.util.Stack;

/*两个栈实现一个队列*/
public class Solution07 {

    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    /*先添加到第一个栈*/
    public void push(int node){
       stack1.push(node);
       /*如果需要构建连续的pop\push操作
       此处需要继续添加对应处理代码。
       * */

    }

    public int pop(){
        if(stack1.isEmpty() && stack2.isEmpty()){
            throw new RuntimeException("queue is empty");
        }
        if(stack2.empty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
