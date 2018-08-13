package com.package1;

import java.util.Scanner;

public class Assgn3 {
static int StudentId;
static String StudentName;
static double Studentfee;
static char StudentSection;
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("emter no of Students");
                int noOfStudents=sc.nextInt();
        for(int i=0;i<2;i++) {
            System.out.println("StudentId");
            int StudentId = sc.nextInt();
            System.out.println("enter Student name");
            String StudentName = sc.next();
            System.out.println("enter Student fee" + i);
            double Studentfee = sc.nextDouble();
            System.out.println("enter Student Section");
            Character StudentSection = sc.next().charAt(i);

            for (int j = 0; j < 1; j++) {
                System.out.println(StudentId + StudentName + StudentSection + Studentfee);
            }
        }
    }
}
