package com.dscl.jianzhioffer;

/*二进制中1的个数*/

public class Offer15 {

    public static void main(String[] args){

//        int x = 9;
//        int result = x&1;
//        System.out.println(result);
        System.out.println(getOneCount(9));
//        Integer[] test = new Integer[8];
//        System.out.println(test[7]);
//        int[] ss = new int[8];
//
//        System.out.println(ss.length);
//        System.out.println(ss[7]);

    }

    public static int getOneCount(int num){

        int count = 0;
        int tmp = num;
        while (tmp > 0){
            count+=tmp&1;
            tmp>>>=1;
        }
        return count;
    }

}
