package com.package1;
import java.util.*;

import static java.util.Collections.*;

public abstract class Practice4 implements Comparable{
    public static void main(String[] args) {

        Map  s=new HashMap();
        s.put("dfks",2);
        s.put("dkadhf",2);
        s.put("cjhsdgkh",3);

        System.out.println(List.of());
        Object o=s.keySet();

       Iterator p=((Set) o).iterator();
       while (p.hasNext()){
           Object i=p.next() ;
           String value= (String) s.get(p);

       System.out.println(value);

       }

    }  }