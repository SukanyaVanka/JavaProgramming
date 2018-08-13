package com.package1;

import java.util.Scanner;

public class Assign3ii {
    static int StudentId;
    static String StudentName;
    static double Studentfee;
    static char StudentSection;
    static char q = 'x';

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter No of students");
        int noOfStudents = sc.nextInt();


        for (int i = 0; i < 2; i++) {
            System.out.println("StudentId");
            int StudentId = sc.nextInt();
            System.out.println("enter Student name");
            String StudentName = sc.next();
            System.out.println("enter Student fee");
            double Studentfee = sc.nextDouble();
            System.out.println("enter Student Section");
            char Studentsection = sc.next().charAt(0);

            System.out.println("StudentId" + "Studentname" + "Studentfee" + StudentId + StudentName + Studentfee);
        }
        char r = sc.next().charAt(0);
System.out.println("result of required section");
        if (StudentSection == r) {

                System.out.println("StudentId" + "Studentname" + "Studentfee" + StudentId + StudentName + Studentfee);
            }
        }
    }



