package com.package1;

import java.util.LinkedList;
import java.util.List;

public class LinkeddListExample {
    public static void main(String[] args) {
        List list1=new LinkedList();
        list1.add("abc");
        list1.add("abc");
        list1.add("abs");
        list1.add(null);
        String s = (String) list1.get(0);
        System.out.println(s);
        System.out.println(list1.size());

        for (int i=0;i<list1.size();i++){
            list1.get(i);

            System.out.println(list1.get(i));
        }
    }
}
//follow insertion order
//allow dupliactes
//allow null