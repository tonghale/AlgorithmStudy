package com.dscl.leetcode;

/*编辑距离 动态方法
* 给你两个单词 word1 和 word2，请你计算出将 word1 转换成 word2 所使用的最少操作数 。
你可以对一个单词进行如下三种操作：
插入一个字符
删除一个字符
替换一个字符
 */

public class code72 {

    public int minDistance(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        /*有一个为空串*/
        if(n*m == 0){
            return n+m;
        }

        /*定义备忘录 dp[x][y] 表示 字符串1中前x个字符 和 字符串2中前y个字符 的最小编辑距离*/
        int[][] dp = new int[n+1][m+1];
        /*初始化边界 假设s2为空时*/
        for(int i=0;i<n+1;i++){
            dp[i][0] = i;
        }
        /*初始化边界 假设s1为空时*/
        for(int j=0;j<m+1;j++){
            dp[0][j] = j;
        }
        /*填充 dp*/
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                int left = dp[i-1][j]+1;
                int down = dp[i][j-1]+1;

                int leftDown;
                /*若s1 和s2的前一个字符相等 则不用替换，不增加 次数，若不相等，则需要替换，次数+1*/
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    leftDown = dp[i-1][j-1];
                }else {
                    leftDown = dp[i-1][j-1]+1;
                }

                /*获取最小元素*/
                dp[i][j] = Math.min(left,Math.min(down,leftDown));
            }
        }
        return dp[n][m];
    }
}
