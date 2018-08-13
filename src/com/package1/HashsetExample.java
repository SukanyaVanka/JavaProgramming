package com.package1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {
    public static void main(String[] args) {

        Set set=new HashSet();
        set.add("abc");
        Boolean b=set.add("abc");
        set.add("abcdd");
        set.add("abd");
        set.add("abcde");
        set.add(null);
        Iterator it=set.iterator();
        while(it.hasNext()){
            Object o=it.next();
            if(o instanceof String){
                String s=(String)o;
                System.out.println(s);
            }
            else{
            }

        }
    }
}
//dont follow insertion order
//dont allow duplicates