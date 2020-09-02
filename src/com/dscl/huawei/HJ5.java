package com.dscl.huawei;

import java.util.Scanner;

public class HJ5 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(2);
        System.out.println(getDecimal(s));
    }

    public static int getDecimal(String s){
        int res = 0;
        for(char ch : s.toCharArray()){

            int base = 0;
            switch (ch){
                case 'A':
                    base = 10;
                    break;
                case 'B':
                    base = 11;
                    break;
                case 'C':
                    base = 12;
                    break;
                case 'D':
                    base = 13;
                    break;
                case 'E':
                    base = 14;
                    break;
                case 'F':
                    base = 15;
                    break;
                default:
                    base = Integer.parseInt(String.valueOf(ch));
            }
            res = res * 16 + base;

        }
        return res;
    }
}
