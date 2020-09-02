package com.dscl.huawei;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HJ8 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        TreeMap<Integer,Integer> treeMap = new TreeMap<>();
        int n = sc.nextInt();
        for(int i=0;i<n;i++ ){
            int k = sc.nextInt();
            int v = sc.nextInt();
            if(treeMap.containsKey(k)){
                treeMap.put(k,treeMap.get(k)+v);
            }else {
                treeMap.put(k,v);
            }
        }
        for(Map.Entry<Integer,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}
