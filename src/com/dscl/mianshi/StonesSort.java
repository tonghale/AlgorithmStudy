package com.dscl.mianshi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*定义一个石头数组，每次从里面选择最大的两个石头。然后若两个石头相等，则都敲碎，若一大一小，则保留大的石头，并且y-x。
最后数组里面只剩下零个石头，或一个石头。
返回数组中石头的重量
* */
public class StonesSort {

    public static void main(String[] args){
        int[] stones = {1,2,3,4,2,4,5,4,3,2};
        System.out.println(cutStones(stones));
    }

    public static int cutStones(int[] stones){

        List<Integer> stoneList = Arrays.stream(stones).boxed().collect(Collectors.toList());

        while (stoneList.size() > 1){
            int x = getMaxAndRemove(stoneList);
            int y = getMaxAndRemove(stoneList);
            if(x!=y){
                stoneList.add(Math.abs(y-x));
            }
        }
        if(stoneList.size() == 0) return 0;
        else return stoneList.get(0);
    }

    static int getMaxAndRemove(List<Integer> stones){
//        int max_index = 0;
//        int max = stones.get(max_index);
//        for(int i=0;i<stones.size();i++){
//            if (stones.get(i) > max){
//                max = stones.get(i);
//                max_index = i;
//            }
//        }
        stones.sort(Integer::compareTo);

        return stones.remove(stones.size()-1);
    }

}
