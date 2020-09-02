package com.dscl.huawei;


import java.util.Scanner;

public class HJ9 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(changeStr(s));
    }

    public static String changeStr(String s){
        int len = s.length();
        String res = "";
        for(int i=len-1;i>=0;i--){
            if(res.contains(String.valueOf(s.charAt(i)))){
                continue;
            }
            res=res+s.charAt(i);
        }
        return res;
    }
}
