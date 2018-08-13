package com.package1;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.*;

public class Assgn8 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(34);
        Collections.sort(l);
        System.out.println(l.get(0));
        System.out.println();

        Map m = new HashMap();

        m.put("ancd",2);
        m.put("abc",4);
        Set keys=m.keySet();

        Iterator it=keys.iterator();


        System.out.println(m.get(0));

        Set set=new HashSet();
        set.add("sukanya");
        set.add("suchi");
        set.add("akhj");
        System.out.println(set.getClass());
    }
}
