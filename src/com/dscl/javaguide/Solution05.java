package com.dscl.javaguide;

/*最长huiwen子序列 （动态规划）*/
public class Solution05 {

    public static void main(String[] args){
        String test = "bbbab";
        int result = longestPalindromeSubseq(test);
        System.out.println(result);
    }
    public static int longestPalindromeSubseq(String s){
        int length = s.length();
        int[][] dp = new int[length][length];

        //初始化
        for(int i=0;i<length;i++){
            dp[i][i] = 1;
        }

        for(int i=length-1;i>=0;i--){
            for(int j=i+1;j<=length-1;j++){
                if(s.charAt(i) == s.charAt(j)){
                    dp[i][j] = dp[i+1][j-1] +2;
                }else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }

        return dp[0][length-1];
    }

}
