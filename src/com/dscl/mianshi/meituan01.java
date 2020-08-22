package com.dscl.mianshi;

import java.util.ArrayList;
import java.util.Scanner;

public class meituan01 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> result = new ArrayList<>();

        String noString = sc.nextLine();
        int no = Integer.parseInt(noString);
        for(int i=0;i<no;i++){
            String s = sc.nextLine();
            String resultStr = verfiyName(s) ? "Accept" : "Wrong";
            result.add(resultStr);
        }
        for(String s : result){
            System.out.println(s);
        }
    }

    public static boolean verfiyName(String s){
        int size = s.length();
        boolean r = false;
        if(!Character.isAlphabetic(s.charAt(0))) return false;

        for(int i=1;i<size;i++){
            if(!Character.isLetterOrDigit(s.charAt(i))) return false;
            if(Character.isDigit(s.charAt(i))){
                r = true;
            }
        }
        return r;
    }

}
