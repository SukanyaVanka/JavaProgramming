package com.package1;

public class Example2 {
        public static void main(String[] abc) {
            double x = 9.5;
            int m = 10;
            String k = "suchi";
            String a = "   H  I   ";
            String b = "heello";
            String c = a.concat(b);
            String d = b.toUpperCase();
            String e = a.intern();
            String f = a.substring(4);
            String g = a.trim();
            String h = k.replaceFirst(k, a);
            char i = k.charAt(3);
            System.out.println(i);
            System.out.println("sqrt of x is" + Math.sqrt(x));
            System.out.println("pow of x is" + Math.pow(x, m));
            System.out.println("round of x is" + Math.round(x));

            System.out.println("ceil x is" + Math.ceil(x));
            System.out.println("random x is"+Math.random());
        }


    }

