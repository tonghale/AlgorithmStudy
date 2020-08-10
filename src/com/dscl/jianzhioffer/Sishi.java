package com.dscl.jianzhioffer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sishi{
    public static int[] getLeastNumbers(int[] arr, int k) {
        if(k==0){
            return new int[0];
        }
        buildMaxHeap(arr,0,k-1);
        for(int i=k;i<=arr.length-1;i++){
            if(arr[i] >= arr[0]){
                continue;
            }else if(arr[i]<arr[0]){
                swap(arr,0,i);
                buildMaxHeap(arr,0,k-1);
            }
        }
        int[] result = new int[k];
        for(int i =0;i<k;i++){
            result[i]=arr[i];
        }
        return result;
    }

    /*在0到k-1之间构建一个最大堆*/
    public static void buildMaxHeap(int[] tree,int left,int right){
        int index = (right-1)/2;
        for(int i = index;i>=left;i--){
            heapify(tree,left,right,i);
        }

    }

    public static void heapify(int[] tree, int left, int right, int i){
        if(i>right){
            return;
        }
        int c1 = 2*i+1;
        int c2 = 2*i+2;
        int max = i;

        if(c1 <= right && tree[c1] > tree[max]){
            max = c1;
        }
        if(c2 <= right && tree[c2] > tree[max]){
            max = c2;
        }
        if(max != i){
            // 交换最大值到父节点
            swap(tree,i,max);
            // 递归，对交换过的数据往下进行以该节点为父节点的heapify
            heapify(tree,left,right,max);
        }
    }

    /*交换其中两个元素*/
    public static void swap(int[] tree,int i,int j){
        if(i<tree.length && j<tree.length){
            int tmp = tree[i];
            tree[i] = tree[j];
            tree[j] = tmp;
        }
    }
    public static void main(String[] args){
        int[] test = {7,9,2,4,2,4,1};
        int[] result = getLeastNumbers(test,3);
        for(int i:result){
            System.out.print(i+" ");
        }
    }
}


