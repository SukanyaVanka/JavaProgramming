package com.package1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchroExample implements Runnable{
    public static void main(String[] args) {
        ExecutorService e=Executors.newFixedThreadPool(3);
        for(int i=0;i<2;i++){
            e.submit(new SynchroExample());
        }
     e.shutdown();
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }
}
