package com.dscl.leetcode;

/*645. 错误的集合
* 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回
*/
/*解决思路：
* 在一个数组内，对对应index 元素 增加负号，作为标识*/
public class code645 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        for(int x : nums){
            int index = Math.abs(x) - 1;
            //
            if(nums[index] < 0){
                result[0] = Math.abs(x);
            }else {
                /*出现一个元素，即把与他相等的下标 的元素做一个标识*/
                nums[index] = nums[index] * (-1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                result[1] = i+1;
            }
        }
        return result;
    }
}
