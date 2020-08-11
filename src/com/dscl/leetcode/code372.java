package com.dscl.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*你的任务是计算 a^b 对 1337 取模，a 是一个正整数，b 是一个非常大的正整数且会以数组形式给出*/
/*核心迭代
a^[1,2,3,4] = a^4 * a^[1,2,3,0] = a^4 * (a^[1,2,3])^10
* */
public class code372 {
    int base = 1337;
    public int superPow(int a, int[] b) {
        ArrayList<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toCollection(ArrayList::new));
        return superPowList(a, bList);
    }

    public int superPowList(int a, List<Integer> list){
        if(list.isEmpty()){
            return 1;
        }else {
            int last = list.remove(list.size()-1);
            return (myPow(a,last) * myPow(superPowList(a,list),10))% base ;
        }
    }

    /*计算a的k次方*/
    public int myPow(int a,int k){
        a = a%base;
        int res = 1;
        for(int i=1;i<=k;i++){
            res = res * a;
            res = res % base;
        }
        return res;
    }
}



