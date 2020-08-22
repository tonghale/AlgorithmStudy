package com.dscl.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*448. 找到所有数组中消失的数字*/
public class code448 {

    /*  使用异或运算的特性，找到唯一的一个缺失值 */
    public int findTheOneDisappearedNumbers(int[] nums) {
        int n = nums.length;
        int res = 0;

        for(int i=0;i<n;i++){
            res = res ^ i ^ nums[i];
        }
        // 因为多出来一个n
        res = res ^ n;
        return res;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int x : nums){
            hashSet.add(x);
        }
        for(int i=0;i<nums.length;i++){
            if(!hashSet.contains(i)){
                list.add(i);
            }
        }
        return list;
    }
}
