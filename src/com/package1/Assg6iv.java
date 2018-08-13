package com.package1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assg6iv {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(32);
        list.add(545);
        list.add(0);
        list.add(-3);
        list.add(24);
        Collections.sort(list);
        System.out.println(list.get(4));
    }
}