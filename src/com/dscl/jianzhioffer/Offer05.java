package com.dscl.jianzhioffer;

/* 替换空格*/
public class Offer05 {
    public static String replaceSpace(String s) {
        int length = s.length();
        StringBuffer result = new StringBuffer();
        for(int i=0;i<length;i++){
            if(s.charAt(i)==' '){
                result.append("%20");
            }else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static String replaceSpace2(String s){
        return s.replaceAll("\\s","%20");
    }

    public static void main(String[] args){
        String test = "We are happy.";
        String result = replaceSpace2(test);

        System.out.println(result);
    }

}
