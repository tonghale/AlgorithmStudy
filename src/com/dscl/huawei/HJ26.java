package com.dscl.huawei;

import java.util.ArrayList;
import java.util.Scanner;

/*题目描述
编写一个程序，将输入字符串中的字符按如下规则排序。

规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。

如，输入： Type 输出： epTy

规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。

如，输入： BabA 输出： aABb

规则 3 ：非英文字母的其它字符保持原来的位置。


如，输入： By?e 输出： Be?y*/
public class HJ26 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        while (sc.hasNext()){
            String s = sc.nextLine();
            String res = solution(s);
            System.out.println(res);
//        }
    }
    public static String solution(String s){
        ArrayList<Character> chars = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                chars.add(s.charAt(i));
            }
        }
        chars.sort((c1,c2)-> Character.toLowerCase(c1)-Character.toLowerCase(c2));
        for(int i=0;i<s.length();i++){
            if(!Character.isLetter(s.charAt(i))){
                sb.append(s.charAt(i));
            }else {
                if(chars.size()>0){
                    sb.append(chars.remove(0));
                }
            }
        }
        return sb.toString();
    }

}
