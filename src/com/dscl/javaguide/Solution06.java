package com.dscl.javaguide;

import java.util.Scanner;

/*括号匹配深度*/
public class Solution06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int length = s.length();
        int count=0,max=0;
        if(length==0){
            return;
        }else {
            for(int i=0;i<length;i++){
                if(s.charAt(i) == '('){
                    count++;
                }else if(s.charAt(i) == ')'){
                    count--;
                }
                if(count>max){
                    max = count;
                }
            }
            System.out.println(max);
        }
    }

}
