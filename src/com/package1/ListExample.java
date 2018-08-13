package com.package1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

interface ListExample {

}
class k implements ListExample {


    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("abc");
        list.add("abc");
        list.add("abs");
        list.add(null);
        String s = (String) list.get(0);
        System.out.println(s);

        for (int i=0;i<list.size();i++){
            list.get(i);
            System.out.println(list.get(i));
        }
    }
}
//aollow duplicates
//follow insertion order
//allow null