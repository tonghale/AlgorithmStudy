package com.dscl.mianshi;

import java.util.ArrayList;
import java.util.Scanner;

public class meituan03 {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        int n =  Integer.parseInt(s0);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String[] w_i = s1.split(" ");
        String[] orders = s2.split(" ");
        int[] maxOrder = new int[n];
        int i=0;
        for(String order : orders){
            int o = Integer.parseInt(order)-1;
            w_i[o] = "0";
            maxOrder[i++] = getMaxWeight(w_i);
        }
        for(int max : maxOrder){
            System.out.println(max);
        }

    }

    public static int getMaxWeight(String[] ss){
        int size = ss.length;
        ArrayList<Integer> result = new ArrayList<>();
        int max = 0;
        for(int i=0;i<size;i++){
            if(Integer.parseInt(ss[i]) == 0){
                result.add(max);
                max = 0;
                continue;
            }
            max+=Integer.parseInt(ss[i]);
        }
        if(max!=0){
            result.add(max);
        }
        result.sort((integer, t1) -> t1);
        return result.get(0);
    }
}
