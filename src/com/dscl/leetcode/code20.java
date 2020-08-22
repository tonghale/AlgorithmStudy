package com.dscl.leetcode;

import java.util.Stack;

/* 20. 有效的括号
*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
有效字符串需满足：
左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
*
* */
public class code20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int size = s.length();

        for(int i=0;i<size;i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                stack.push(s.charAt(i));
            }else {
                if(!stack.isEmpty() && leftOfChar(s.charAt(i)) == stack.peek()){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

    public Character leftOfChar(Character c){
        if (c == ')') return '(';
        if (c == ']') return '[';
        else return '{';
    }
}
