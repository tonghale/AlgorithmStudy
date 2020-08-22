package com.dscl.sort;

/**
 * @Author: dong hao
 * @Date: 2020/8/12 10:02
 */
public class Sort {
    public static void main(String[] args){
        int[] array = {10,9,8,7,6,5,4,3,2,1};
//        selectSort(array);
//        insertSort(array);
//        quickSort(array,0,array.length-1);
        merageSort(array,0,array.length-1);
        printArray(array);
    }

    public static void printArray(int[] array){
        for(int x:array){
            System.out.print(x + " ");
        }
    }

    /*冒泡排序*/
    public static void bubbleSort(int[] array){
        int size = array.length;
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-1-i;j++){
                if (array[j] > array[j+1]){
                    int tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    /*选择排序*/
    public static void selectSort(int[] array){
        int size = array.length;
        for(int i=0;i<size-1;i++){
            int minIndex = i;
            // 找到最小值得index
            for(int j=i;j<size;j++){
                if(array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            // 如果minIndex 在后面 ，则进行交换
            if(minIndex != i){
                int tmp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = tmp;
            }
        }
    }

    /*插入排序*/
    public static void insertSort(int[] array){
        int size = array.length;
        for(int i=1;i<size;i++){

            for(int j=i;j>0;j--){
                if(array[j] < array[j-1] ){
                    int tmp = array[j];
                    array[j] =array[j-1];
                    array[j-1] = tmp;
                }else {
                    break;
                }
            }
        }
    }

    /*快速排序*/
    public static void quickSort(int[] array,int start, int end){

        //递归出口
        if(start>=end){
            return;
        }

        int mid = array[start];
        int low = start;
        int high = end;

        while (low < high){
            while (low < high && array[high] >= mid){
                high-=1;
            }
            array[low] = array[high];
            while (low < high && array[low] <= mid){
                low+=1;
            }
            array[high] = array[low];
        }
        array[low] = mid;


        //对左侧数组进行递归
        quickSort(array,start,low-1);
        quickSort(array,low+1,end);
    }


    /*归并排序*/
    public static void merageSort(int[] array,int start, int end){
        // 递归条件
        if(start < end){
            int mid = (start+end)/2;


            //拆分阶段
            merageSort(array,start,mid);
            merageSort(array,mid+1,end);

            // 合并阶段
            int left = start;
            int right = mid+1;
            // 临时存放合并数组
            int[] tmp = new int[end-start+1];
            //定义tmp的下标
            int t = 0;
            while (left <= mid && right <= end){
                if (array[left] < array[right]){
                    tmp[t] = array[left];
                    left++;
                    t++;
                }else {
                    tmp[t] = array[right];
                    right++;
                    t++;
                }
            }
            // 如果左边有剩余
            while (left <= mid){
                tmp[t++] = array[left++];
            }
            // 如果右边有剩余,则全部丢到tmp
            while (right <= end){
                tmp[t++] = array[right++];
            }

            //将tmp数组内容重新赋值给array
            for(int i=0;i<t;i++){
                array[start+i] = tmp[i];
            }

        }





    }
}

