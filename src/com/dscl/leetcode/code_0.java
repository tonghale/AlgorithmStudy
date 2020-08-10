package com.dscl.leetcode;


import java.util.*;

public class code_0 {
    public static void main(String[] args){

        System.out.println("二分查找");
        List<String> ss = new ArrayList<>(10);
        for(int i=0;i<10;i++){
            ss.add("test");
        }
        ss.add("nihao");
        System.out.println(ss.size());
        System.out.println(ss);

        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<10;i++){
            map.put(i,"nihao");
            map.put(2,"zhenxiang");
        }
        System.out.println(map);
        System.out.println(map.values());

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<10;i++){
            set.add(i);
            set.add(2);
        }
        System.out.println(set);

        Queue<String> queue = new LinkedList<String>();
        queue.add("nihao");
        System.out.println(queue);

        List<Boolean> b = new LinkedList<Boolean>();
        b.add(true);
        System.out.println(b);
    }
}
