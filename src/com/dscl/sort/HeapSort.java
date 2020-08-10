package com.dscl.sort;

public class HeapSort {

    /*只做一次三个节点构成的堆*/
    public static void heapify(int[] tree, int n, int i){
        if(i>n){
            return;
        }
        int c1 = 2*i+1;
        int c2 = 2*i+2;
        int max = i;

        if(c1 < n && tree[c1] > tree[max]){
            max = c1;
        }
        if(c2< n && tree[c2] > tree[max]){
            max = c2;
        }
        if(max != i){
            // 交换最大值到父节点
            swap(tree,i,max);
            // 递归，对交换过的数据往下进行以该节点为父节点的heapify
            heapify(tree,n,max);
        }

    }

    /*通过遍历调用heapify 构成完整堆*/
    public static void buildHeap(int[] tree,int n){
        // 获取二叉树倒数第二层的最后一个元素，
        int i;
        for(i = ((n-1)-1)/2;i>=0;i--){
            heapify(tree,n,i);
        }
    }

    /*全排序*/
    public static void heapSort(int[] tree){
        int size = tree.length;
        for(int n = size;n>0;n--){
            buildHeap(tree,n);
            swap(tree,0,n-1);
        }
    }

    /*top k 排序 找前K大的数*/
    public static void heap_top_k(int[] tree,int k){
        int n = tree.length;
        for(int i=0;i<k;i++){
            buildHeap(tree,n-i);
            swap(tree,0,n-i-1);
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
        int[] test = {4,10,3,5,1,2};
        int n = test.length;
//        heapify(test,n,0);
//        heapSort(test);
        heap_top_k(test,2);
        for(int i : test){
            System.out.print(i+" ");
        }

    }


}
