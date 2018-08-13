package com.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assg6iii {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(9);
        list.add(4);
        list.add(11);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);
    }
}
