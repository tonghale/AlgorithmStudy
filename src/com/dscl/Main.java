package com.dscl;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s0 = sc.nextLine();
        String[] test = s0.split(" ");
        int a = Integer.parseInt(test[0]);
        int b = Integer.parseInt(test[1]);
        String s2 = sc.nextLine();
        System.out.println("读到了");
        System.out.println(a);
        System.out.println(b);
        System.out.println(s2);

    }
}
