package com.dscl.jianzhioffer;

/*剪绳子，求乘积最大。
* 经数学推导，切成每段为3最优，其次切成每段为2
* 所以考虑优先按长度3进行切分，剩余的部分按值考虑，若余2，则不再切分，若余1，则拿一个3 然后切成 2+2*/

public class Offer14_2 {

    public static void main(String[] args){
        int x = 3;
        double r = Math.pow(x,2);
        System.out.println(r);
    }

    public static int cuttingRope(int n){
        if(n<=3){return n-1;}

        // 余数
        int b = n % 3;
        int count = (n-b)/3;    //当前划分的段数
        double result = 0;     //记录结果
        int p = 1000000007;  // 整形最大值，防止溢出
        if(b==0){
            result =  Math.pow(3,count) % p;
        }else if(b==1){
            result = Math.pow(3,count-1) * 2 * 2 % p;
        }else if(b==2){
            result = Math.pow(3,count) * 2 % p;
        }
        return (int)result;
    }
}
