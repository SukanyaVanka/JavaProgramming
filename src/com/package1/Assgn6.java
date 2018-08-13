package com.package1;

import java.util.Scanner;

public class Assgn6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enternumber");
        int a = sc.nextInt();
        int m;
        for (int i = 1; i <=10; i++) {
            m = a * i;

            System.out.println(a+"*"+i+"="+(a*i));
        }

    }

}