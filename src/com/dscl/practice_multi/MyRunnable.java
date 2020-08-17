package com.dscl.practice_multi;

import javax.swing.table.TableRowSorter;
import java.util.Date;

public class MyRunnable implements Runnable {
    private String command;

    public MyRunnable(String s){
        this.command = s;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start time = "+new Date());
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " end "+ new Date() );
    }

    @Override
    public String toString() {
        return "MyRunnable{" +
                "command='" + command + '\'' +
                '}';
    }
}
