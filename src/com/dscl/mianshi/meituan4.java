package com.dscl.mianshi;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class meituan4 {
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        String s1 = sc.nextLine();
        String[] test = s0.split(" ");
        int x = Integer.parseInt(test[0]);
        int y = Integer.parseInt(test[1]);
        String[] valueStr = s1.split(" ");
        int[] value = new int[valueStr.length];
        int[] result = new int[valueStr.length];
        for(int i=0;i<valueStr.length;i++){
            value[i] = Integer.parseInt(valueStr[i]);
        }

        Arrays.sort(value);

    }
}
