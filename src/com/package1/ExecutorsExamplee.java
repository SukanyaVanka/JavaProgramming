package com.package1;

import java.sql.Time;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsExamplee {
    public static void main(String[] args) {


        ExecutorService e=Executors.newFixedThreadPool(4);//ctreate threads

            Runnable worker = new Runnable() {
                @Override
                public void run() {

                    System.out.println("inside method");
                }//anoymous method
            };
        for (int i=0;i<10;i++) {
            e.execute(worker);
        }
        e.shutdown();
        while (!e.isTerminated()){
            System.out.println("not terminated");
        }
        }
    }

