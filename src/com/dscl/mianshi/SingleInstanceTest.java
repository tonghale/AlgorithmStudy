package com.dscl.mianshi;

public class SingleInstanceTest {
    public static void main(String[] args){
        SingleInstance singleInstance = SingleInstance.getInstance();

        System.out.println(singleInstance.hashCode());

        SingleInstance singleInstance12 = SingleInstance.getInstance();
        System.out.println(singleInstance12.hashCode());
    }
}
