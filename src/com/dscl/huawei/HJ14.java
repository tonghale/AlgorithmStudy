package com.dscl.huawei;

import java.util.Arrays;
import java.util.Scanner;

/*题目描述
给定n个字符串，请对n个字符串按照字典序排列。*/
public class HJ14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] ss = new String[n];
        for(int i=0;i<n;i++){
            ss[i] = sc.next();
        }
        solution(ss);
    }
    public static void solution(String[] ss){
        Arrays.sort(ss);
        for(String s:ss){
            System.out.println(s);
        }
    }
}
