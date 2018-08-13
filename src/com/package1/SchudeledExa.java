package com.package1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
class Scheduledexample implements Runnable{


    public static void main(String[] args) {
        ScheduledExecutorService s=Executors.newSingleThreadScheduledExecutor();//
        s.schedule(new Scheduledexample(),2,TimeUnit.SECONDS);
        s.shutdown();
    }




    @Override
    public void run() {
        System.out.println("inside methpd");
    }
}
