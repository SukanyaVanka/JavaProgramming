package com.package1;

public class TreadExample extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("thread name" );
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("inside method" );
        TreadExample t = new TreadExample();
t.setName("sukanya");
        t.start();
        Threadexample t1 = new Threadexample();
        t1.run();


    }
}