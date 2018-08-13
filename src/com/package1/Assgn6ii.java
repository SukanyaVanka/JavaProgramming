package com.package1;

import java.util.Scanner;

public class Assgn6ii {

    public static void main(String[] args) {
        int [][][]a=new int [1][10][10];

        Scanner sc = new Scanner(System.in);
        System.out.println("emter number");
        int b = sc.nextInt();
        for (int i = 1; i < 2; i++) {

            for (int j = 1; j <= 10; j++) {


                for (int k = 1; k <= 10; k++) {
                    int s;
s=i*j*k;

                    System.out.println(s+"="+i+"*"+j+"*"+k);

                }

            }
        }
    }}
