package com.dscl.huawei;

import java.util.Scanner;

public class HJ21 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = solution(s);
        System.out.println(res);
    }

    public static String solution(String s){
        final String helpFromStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        final String helpToStr = "bcdefghijklmnopqrstuvwxyza222333444555666777788899990123456789";

        int n = s.length();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            for(int j=0;j<helpFromStr.length();j++){
                if(c == helpFromStr.charAt(j)){
                    sb.append(helpToStr.charAt(j));
                }
            }
        }
        return sb.toString();
    }
}
