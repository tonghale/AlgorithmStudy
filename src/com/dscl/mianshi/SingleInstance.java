package com.dscl.mianshi;

/*最简单的单例模式*/
public class SingleInstance {

    private static volatile SingleInstance singleInstance;

    private SingleInstance(){
    }

    public synchronized static SingleInstance getInstance(){
        if( singleInstance == null ){
            synchronized (SingleInstance.class){
                singleInstance =  new SingleInstance();
            }
        }
        return singleInstance;
    }
}


