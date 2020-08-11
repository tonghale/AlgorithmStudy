package com.dscl.leetcode;

/*
* 珂珂喜欢吃香蕉。这里有 N 堆香蕉，第 i 堆中有 piles[i] 根香蕉。警卫已经离开了，将在 H 小时后回来。
珂珂可以决定她吃香蕉的速度 K （单位：根/小时）。每个小时，她将会选择一堆香蕉，从中吃掉 K 根。如果这堆香蕉少于 K 根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉。  
珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。
返回她可以在 H 小时内吃掉所有香蕉的最小速度 K（K 为整数）


 * */
public class code875 {

    public static int minEatingSpeed(int[] piles, int H) {
        int max = getMax(piles); /*可能的最大速度*/
        /*该for循环可以用二分的思路进行求解最左边界*/
        /*for(int speed=1; speed<max; speed++){
            if(canFinsh(speed,piles,H)){
                return speed;
            }
        }*/
        int left = 1, right = max+1;
        while (left<right){
            int mid = left+(right-left)/2;
            if(canFinsh(mid,piles,H)){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return left;
    }

    /*获取 该数组中的最大值*/
    public static int getMax(int[] piles){
        int max = 0;
        for(int x:piles){
            if(max < x){
                max = x;
            }
        }
        return max;
    }

    public static boolean canFinsh(int speed,int[] piles,int H){
        int time = 0;
        for(int x : piles){
            int x_time_1 = x/speed;
            int x_time_2 = x%speed>0?1:0;
            time = time + x_time_1 + x_time_2;
        }
        return time <= H ? true : false;
    }

    public static void main(String[] args){
        int[] piles = {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(piles,h));
    }
}

