package com.package1;

import java.util.Arrays;
import java.util.List;

public class Assgn10iii {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,5,7,3,8,10,48,67,2,23,56,11,4,100);
        list.stream().filter(s->(s>=5))
        .forEach(s->System.out.println(s));

        }

    }

