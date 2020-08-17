package com.dscl.practice_multi;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*使用 threadPoolExecutor 创建多线程*/
public class ThreadPoolExecutorDemo {

    public static void main(String[] args){
        /*定义线程池*/
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,10,1L,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(100),new ThreadPoolExecutor.CallerRunsPolicy());

        for(int i=0;i<10;i++){
            Runnable runnable = new MyRunnable(""+i);
            executor.execute(runnable);
        }

        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println("结束线程池demo");
   
    }
}
