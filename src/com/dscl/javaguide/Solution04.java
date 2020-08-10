package com.dscl.javaguide;

/*最长回文子串*/
public class Solution04 {
    private static int index,subLength=0;

    public static void main(String[] args){
        String test = "babad";
        String result = longestHuiwen(test);
        System.out.println(result);
    }
    public static String longestHuiwen(String str){
        int length = str.length();
        if(length <2){
            return str;
        }
        //遍历字符串
        for(int i=0;i<length;i++){
           seachHuiwen(str,i,i);
           seachHuiwen(str,i,i+1);
        }
        String result = str.substring(index,index+subLength);
        return result;
    }

    public static void seachHuiwen(String str,int l,int r){
        while (l>=0&&r<=str.length()-1 && str.charAt(l) == str.charAt(r)){
            l--;
            r++;
        }
        // 要存放最大的subLength
        if(r-l-1 > subLength){
            index = l+1;
            subLength = r-l-1;
        }
    }
}
