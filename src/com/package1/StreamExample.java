package com.package1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        List<String> l=Arrays.asList("a1","a2","c","c2");
        l.stream().filter(s->{
        return s.startsWith("a");

        })
                .distinct()
                .collect(Collectors.toList())

                .forEach(s->System.out.println(s));

    }
    Integer sum=Stream.of(1,2,3)
            .reduce(0,(a,b)-> Integer.sum(a,b));

}
