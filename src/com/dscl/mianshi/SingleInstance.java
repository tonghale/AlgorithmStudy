package com.dscl.mianshi;

/*最简单的单例模式*/
public class SingleInstance {

    private static SingleInstance singleInstance = new SingleInstance();

    private SingleInstance(){
    }

    public static SingleInstance getInstance(){
        if( singleInstance == null ){
            return new SingleInstance();
        }
        else {
            return singleInstance;
        }
    }
}


