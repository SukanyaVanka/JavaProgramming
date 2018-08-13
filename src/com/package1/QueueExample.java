package com.package1;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue q=new PriorityQueue();
        q.add("abcd");
        q.add("abc");
        q.add("ab");
        q.add("abcd");
        Iterator it = q.iterator();
        while (it.hasNext()) {
            Object l = it.next();
            if (l instanceof String) {
                String s = (String) l;
                System.out.println(s);
            } else {
            }
        }
    }
}
//follow acsending order
//
