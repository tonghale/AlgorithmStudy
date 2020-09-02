package com.dscl.mianshi;

import java.util.Scanner;

public class qianxin01 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = countStairs(n);
        System.out.println(res);
    }

    public static int countStairs(int n){
        int result = 0;
        if(n<=0) return 0;
        if(n>36) return 0;
        if(n<=3) return n;
        int first = 2;
        int sencond = 3;
        for(int i=4;i<=n;i++){
            result = first + sencond;
            first = sencond;
            sencond = result;
        }
        return result;
    }
}
