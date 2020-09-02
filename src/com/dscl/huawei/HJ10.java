package com.dscl.huawei;

import java.util.HashSet;
import java.util.Scanner;

/*
* 题目描述
编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
输入
abaca
输出
3*/
public class HJ10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(changeStr(s));

    }

    public static int changeStr(String s){
        int len = s.length();
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i<len;i++){
            if(s.charAt(i)>0 && s.charAt(i)<127){
                hashSet.add(s.charAt(i));
            }
        }
        return hashSet.size();
    }
}
