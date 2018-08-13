package com.package1;

import java.util.Arrays;
import java.util.List;

class Assgn{
    public static void main(String[] args) {
        List <String>list=Arrays.asList("d2","a2","b1","b3","c2");
        list.stream().filter(s-> s.startsWith("a"))
        .map(s->s.toUpperCase())
        .forEach(s1-> System.out.println(s1));

        }
    }
