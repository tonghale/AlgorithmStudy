package com.dscl.leetcode;


/*42. 接雨水
* 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
*
* */
public class code42 {


    public int trap(int[] height) {

        int size = height.length;
        // 分别求位置i处的左边最高高度 和右边最高高度
        int[] l_max = new int[size];
        l_max[0] = height[0];
        int[] r_max = new int[size];
        r_max[size-1] = height[size-1];
        //从左向右一遍计算lmax
        for(int i=1;i<size;i++){
            l_max[i] = Math.max(l_max[i-1],height[i]);
        }
        //从右向左一遍计算rmax
        for(int i=size-2;i>=0;i--){
            r_max[i] = Math.max(r_max[i+1],height[i]);
        }

        int result = 0;//初始化结果
        // 计算确定的值
        for(int i=0;i<size;i++){
            // 位置i 可容纳的雨水 = 位置i左侧最大值和右侧最大值，两个值中的最小值 - 当前i位置的高度；
            result += Math.min(l_max[i],r_max[i]) - height[i];
        }
        return result;
    }

    public int trap_2(int[] height){

        int left = 0, right=height.length-1;
        int l_max = height[0];
        int r_max = height[height.length-1];

        int result = 0;
        while (left <= right){

            l_max = Math.max(l_max,height[left]);
            r_max = Math.max(r_max,height[right]);

            /*谁 小 谁往前移动，若l<r,证明当前右边的最大值(不一定是r_max)肯定比l大，当前积水已l_max为计算*/
            if(l_max < r_max){
                result += l_max-height[left];
                left++;
            }else {
                result += r_max-height[right];
                right--;
            }
        }

        return result;
    }

}
