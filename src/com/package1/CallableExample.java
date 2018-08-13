package com.package1;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class CallableExample implements Callable {



     @Override
     public Object call() throws Exception {
         for (int i = 0; i <= 5; i++) {
             System.out.println("thread nameeeee");
             System.out.println(i);

         }
         return "sukanya";
     }

     public static void main(String[] args) throws Exception {
CallableExample c=new CallableExample();

         FutureTask tas=new FutureTask(c);
         Thread o=new Thread(tas);
         o.start();
tas.get();
System.out.println(tas.get());
System.out.println(c);
     }
 }

