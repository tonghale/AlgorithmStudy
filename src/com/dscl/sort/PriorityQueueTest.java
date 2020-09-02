package com.dscl.sort;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args){
//        PriorityQueue<Integer> test = new PriorityQueue<Integer>();
        PriorityQueue<Integer> test = new PriorityQueue<>((v1,v2)-> (v2-v1));
        test.add(1);
        test.add(2);
        test.add(10);
        test.add(5);
        test.add(7);
        test.add(9);
        for(int i : test){
            System.out.print(i+" ");
        }
        System.out.println();
        while (!test.isEmpty()){
            System.out.print(test.poll() + " ");

        }
    }
}
