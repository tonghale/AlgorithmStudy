package com.dscl.leetcode;

/*55. 跳跃游戏
* 给定一个非负整数数组，你最初位于数组的第一个位置。
* 数组中的每个元素代表你在该位置可以跳跃的最大长度。
* 判断你是否能够到达最后一个位置 */
public class code55 {

    public boolean canJump(int[] nums) {
        int n = nums.length;
        int far = 0; // 定义全局最远能够到达距离

        for(int i=0;i<n-1;i++){
            far = Math.max(far, i+nums[i]);
            // 如果碰到了 0，永远卡主，跳不动了。
            if(far <= i){
                return false;
            }
        }
        // 若最远距离超过 n-1 ,则说明能够达到。
        return far >= n-1;

    }

    /* 45  贪心计算最少跳跃次数*/
    public int jump(int[] nums) {

        int n = nums.length;
        int far = 0; // 定义每一跳的范围内，能够跳到的最远距离。
        int end = 0; // 定义每一跳的范围内最后一个位置。
        int count = 0; // 定义跳跃次数。
        for(int i=0;i<n-1;i++){
            far = Math.max(far,i+nums[i]);
            if(end == i){
                // 更新end，为当前能够跳跃到的最远距离。
                end = far;
                // 满足 向最远距离内跳跃一次。
                count++;
            }
        }
        return count;
    }
}
