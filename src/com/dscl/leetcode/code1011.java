package com.dscl.leetcode;

/*传送带上的包裹必须在 D 天内从一个港口运送到另一个港口。
传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
返回能在 D 天内将传送带上的所有包裹送达的船的最低运载能力。
*/
public class code1011 {
    public static int shipWithinDays(int[] weights, int D) {
        int max=0,sum=0;
        for(int x : weights){
            sum += x;
            if(max < x) max = x;
        }
        int left=max,right=sum+1; //二分的左右条件
        while (left<right){
            int mid = left + (right - left)/2;
            if(canLoad(weights,D,mid)){
                right=mid;
            }else {
                left=mid+1;
            }
        }
        return left;
    }

    public static boolean canLoad(int[] weights,int D,int load){
        int count = 0;
        int tmp = 0;
        for(int x=0;x<weights.length;x++){
            tmp+=weights[x];
            if(tmp>load){
                count++;
                tmp=weights[x];
            }
        }
        return count+1 <= D;
    }


    public static void main(String[] args){
        int[] wei = {1,2,3,4,5,6,7,8,9,10};
        int d = 5;
        System.out.println(shipWithinDays(wei,d));
    }
}
