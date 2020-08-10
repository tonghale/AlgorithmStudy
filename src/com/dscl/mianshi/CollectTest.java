package com.dscl.mianshi;

import java.util.*;
import java.util.stream.Collectors;

public class CollectTest {

    public CollectTest() {
    }

    public static void main(String[] args){

//        int[] data = {1,2,3,4,5,6,7,8,9,10};
//
//        List<Integer> list1 = Arrays.stream(data).boxed().collect(Collectors.toList());
//        list1.add(0,10);
//        list1.set(1,9);
//        System.out.println(list1.get(0));
//        System.out.println(list1.get(1));
//        System.out.println(list1.size());
//
//        ArrayList<Integer> arrayList = Arrays.stream(data).boxed().collect(Collectors.toCollection(ArrayList::new));
//        arrayList.set(0,11);
//        arrayList.add(11);
//        arrayList.remove(0);
//        arrayList.get(0);
//
//        Integer[] integers = Arrays.stream(data).boxed().toArray(Integer[]::new);
//
//        Integer[] integers1 = list1.toArray(new Integer[0]);
//
//        LinkedList linkedList = Arrays.stream(data).boxed().collect(Collectors.toCollection(LinkedList::new));
//        linkedList.size();
//        linkedList.add(0,10);
//        linkedList.set(0,9);
//        linkedList.remove(0);
//        linkedList.poll();
//        linkedList.peek();
//        linkedList.push(8);
//        linkedList.pop();
//        linkedList.offer(11);
//
//        String test[] = new String[linkedList.size()];
//        test[0] = "aaa";
//        String[] test2 = new String[linkedList.size()];
//        test2[0] = "bbb";
//        int x_l = test.length;
//        int y_l = test2.length;
//
//        Vector<Integer> vector = new Vector<Integer>();
//        vector.add(1);
//        vector.add(2);
//        vector.addElement(3);
//        vector.addElement(4);
//        boolean res = vector.contains(1);
//        int x = vector.get(1);
//        vector.trimToSize();
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"111");
        hashMap.put(2,"222");
        hashMap.put(3,"333");
        hashMap.put(4,"444");
        hashMap.put(5,"555");

        String aa = hashMap.get(1);
        hashMap.size();
        HashMap<Integer,Object> hashMap1 = new HashMap<>();
        hashMap1 = (HashMap<Integer,Object>)hashMap.clone();
        hashMap1.put(6,"666");
        hashMap1.remove(3);
        hashMap1.replace(1,"aaa");
        hashMap1.replace(2,"222","bbb");

        HashSet<Integer> hashSet = new HashSet<>(hashMap1.keySet());
        hashSet.add(3);
        hashSet.add(7);
        hashSet.size();
    }


}
