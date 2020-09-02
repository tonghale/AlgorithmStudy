package com.dscl.huawei;

import java.util.Scanner;
import java.util.Stack;

/*走迷宫*/
public class HJ43 {

     public static void main(String[] args){
        int n,m;
        int[][] maze;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            n = sc.nextInt();
            m = sc.nextInt();
            maze = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    maze[i][j] = sc.nextInt();
                }
            }
        }
//        dfs(maze,0,0,Stack)

    }

    public static boolean dfs(int[][] maze, int i, int j, Stack<Pair> paths){
        return true;
    }

    private class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i = i;
            this.j = j;
        }
        public String toString(){
            return "(" + i + "," + j + ")";
        }
    }
}
