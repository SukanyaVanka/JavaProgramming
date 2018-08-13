package com.package1;

class Threadexample implements Runnable {

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println("thread name"+Thread.currentThread());
            System.out.println(i);
            Thread.yield();//void
        }
    }
    public static void main(String[] args)throws InterruptedException {
        System.out.println("inside method" + Thread.currentThread());
        Threadexample t = new Threadexample();
        Thread t2 = new Thread();
        t2.start();
        t2.setName("suchi");

        t2.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(4);
        Threadexample t4=new Threadexample();
        t4.run();

        Threadexample t1 = new Threadexample();
        t1.run();

        try {
            t2.join();

        }
            catch(InterruptedException e){

            }

t.run();
        }

    }