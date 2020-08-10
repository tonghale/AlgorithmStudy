package com.dscl.javaguide;
/*验证回文串*/
public class Solution03 {

    public static void main(String[] args){
         String test = "am ana,plan aca nal!Pa nama";
         System.out.println(isHuiwen(test));
    }

    public static boolean isHuiwen(String str){
        if(str.length() == 0){
            return true;
        }
        int length = str.length();
        int l = 0;
        int r = length-1;
        while (l<r){
            if(!Character.isLetterOrDigit(str.charAt(l))){
                l++;
            }else if (!Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }else {
                if(Character.toLowerCase(str.charAt(l)) == Character.toLowerCase(str.charAt(r))){
                    l++;
                    r--;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
