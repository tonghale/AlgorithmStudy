package com.dscl.javaguide;

import java.util.Arrays;

/*最长公共前缀*/
public class Solution01 {
    public static String LongPreString(String[] strs){
        if(strs.length == 0 || strs == null){
            return " ";
        }
        Arrays.sort(strs);
        int length = strs.length;
        StringBuilder result = new StringBuilder();
        String first = strs[0];
        String end = strs[length-1];
        int minSize = Math.min(first.length(),end.length());
        for(int i=0;i<minSize;i++){
            if(first.charAt(i) == end.charAt(i)){
                result.append(first.charAt(i));
            }
            else{
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args){
        String[] test = {"fflow","fffff","ffrined"};
        String result = LongPreString(test);
        System.out.println(result);
    }
}
