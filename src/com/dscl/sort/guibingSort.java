package com.dscl.sort;

public class guibingSort {

    public static void main(String[] args){
        int[] arr = {1,3,5,6,2,9,4};
        sort(arr);
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }

    public static void sort(int[] arr){
        int[] tmp = new int[arr.length];
        sort_merage(arr,0,arr.length-1,tmp);
    }

    public static void sort_merage(int[] arr,int left,int right,int[] tmp){
        if(left<right){
            int mid = (left+right)/2;
            sort_merage(arr,left,mid,tmp);
            sort_merage(arr,mid,right,tmp);
            merage(arr,left,mid,right,tmp);
        }
    }

    public static void merage(int[] arr,int left,int mid,int right,int[] temp){
        int i = left;
        int j = mid;
        int t = 0;
        while (i<=mid && j<=right){
            if (arr[i]<=arr[j]){
                temp[t++] = arr[i++];
            }else {
                temp[t++] = arr[j++];
            }
        }
        while(i<=mid){//将左边剩余元素填充进temp中
            temp[t++] = arr[i++];
        }
        while(j<=right){//将右序列剩余元素填充进temp中
            temp[t++] = arr[j++];
        }
        //将temp中的元素全部拷贝到原数组中
        while(left <= right){
            arr[left++] = temp[t++];
        }

    }




}
