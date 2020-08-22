package com.dscl.jianzhioffer;

import java.util.Stack;

/*剑指 Offer 30. 包含min函数的栈*/
public class Offer30 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    /*MinStack*/
    public Offer30() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || minStack.peek() > x){
            minStack.push(x);
        }
    }

    public void pop() {
        if(!stack.isEmpty()){
            if(!minStack.isEmpty() && stack.peek().equals(minStack.peek()) ){
                minStack.pop();
            }
            stack.pop();
        }
    }

    public int top() {
        if(!stack.isEmpty()) return stack.peek();
        else return 0;
    }

    public int min() {
        if(!minStack.isEmpty()) return minStack.peek();
        else return 0;
    }
}
