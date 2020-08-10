package com.dscl.mianshi;

public class MyHashMapTest {
    public static void main(String[] args){
        MyHashMap test = new MyHashMap();
        test.put(1,"111");
        test.put(2,"222");
        test.put(3,"333");
        System.out.println(test.getSize());
        test.put(4,"444");
        System.out.println(test.getSize());
        System.out.println(test.get(4));

        MyHashMap test2 = new MyHashMap(6);
        System.out.println(test2.getSize());
    }
}
