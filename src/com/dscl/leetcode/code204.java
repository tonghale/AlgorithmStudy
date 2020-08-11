package com.dscl.leetcode;

/*如何高效寻找素数*/
/*利用两点：
* 1.素数的乘积都不可能是素数  比如 2 是素数，所以 2*2  2*3 2*4 就都不是素数
* 2.判断n是不是素数，只需要遍历【2，sqrt(n)】,确定能不能被整除即可，
* 比如：n=12,
* 2*6 = 12
* 3*4 = 12
* sqrt(12) *sqrt(12) = 12
* 4*3 = 12
* 6*2 = 12*/

import java.util.Arrays;

public class code204 {

    static int countPrimes(int n){
        /*用一个数组存放 该值是不是素数*/
        boolean[] isPrim = new boolean[n+1];
        // 默认都为true
        Arrays.fill(isPrim,true);

        /*遍历计算数组中的值*/
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                /*如果当前值是素数，则其所有的倍数都不是素数*/
                for(int j=i*2;j<n+1;j+=i){
                    isPrim[j] = false;
                }
            }
        }
        int count = 0;
        for(int i=2;i<n+1;i++){
            if(isPrim[i]){
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            /*有其他整除因子*/
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(countPrimes(10));
    }

}
