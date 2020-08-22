package com.dscl.mianshi;

import java.util.ArrayList;
import java.util.Scanner;

public class meituan02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String[] s1s = s1.split(" ");
        int a = Integer.parseInt(s1s[0]);
        int b = Integer.parseInt(s1s[1]);
        ArrayList<Integer> num = new ArrayList<>(a);
        ArrayList<Integer> cost = new ArrayList<>(a);
        int[] result = new int[b];

        for(int i=0;i<a;i++){
            String inputStr = sc.nextLine();
            String[] tmpStr = inputStr.split(" ");
            int v = Integer.parseInt(tmpStr[0]);
            int w = Integer.parseInt(tmpStr[1]);
            cost.add(v + w*2) ;
            num.add(i);
        }

        for(int j=0;j<b;j++){
            int len = cost.size();
            int max_index = 0;

            for(int k=0;k<len;k++){
                if(cost.get(k) > cost.get(max_index)){
                    max_index = k;
                }
            }
            cost.remove(max_index);
            result[j] = num.get(max_index);
            num.remove(max_index);
        }

        for(int x : result){
            System.out.print( x+1 + " ");
        }

    }

}
