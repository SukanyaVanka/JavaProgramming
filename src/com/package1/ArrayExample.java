package com.package1;

public class ArrayExample {
    public static void main(String[] d) {
        int[] c = new int[10];
        String[] s = {"jhkj", "bdhwef"};
        c[0] = 1;
        c[2] = 30;
        System.out.println(c[2]);
        printArray(s);
    }


     public static <T> void printArray(T [] array){

            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
