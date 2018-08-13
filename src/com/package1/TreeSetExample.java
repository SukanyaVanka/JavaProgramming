package com.package1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set set1 = new TreeSet();
        set1.add("abc");
        set1.add("abc");
        set1.add("xyz");
        set1.add("xzqq");
        set1.add("ab");

        for (int i = 0; i < set1.size(); i++) {
            System.out.println(set1.size());}

            Iterator it = set1.iterator();
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


//dont allownull
//follow acsending order
//dont allow duplicates