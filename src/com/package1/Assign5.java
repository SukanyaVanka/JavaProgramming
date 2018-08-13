package com.package1;

import java.util.Scanner;

class Employee {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter No of employees");
        int noOfEmployees = sc.nextInt();
        for(int i=0;i<noOfEmployees;i++) {
            System.out.println("enter id");
            int id = sc.nextInt();
            System.out.println("enter deptid");
            int deptid = sc.nextInt();
            System.out.println("enter empname");
            String empName = sc.next();
            System.out.println("enter DeptName");
            String deptName = sc.next();
            System.out.println("enter location");
            String location = sc.next();
            System.out.println("enter salary");
            double salary = sc.nextDouble();
        }
            employee e=new employee();
                e.id=100;
        employee obj=new employee();
        obj.id=100;
            System.out.println(e.equals(obj));

        }
       public static class employee {
            int id;
            String name;
            double salary;
            public void SetId(int id) { this.id = id; }
            public void setname(String name) {
                this.name = name;
            }
            public void segsalary(double salary) {
                this.salary = salary;
            }
            public int getId(int id) { return id; }
            public String getName() {
                return "getName";
            }
            public double getSalary() {
                return salary;
            }}
        class Department extends employee {
            int deptid;
            String deptNamee;
            String location;
            Department d1 = new Department();
            void setdeptid(int deptid) { this.deptid = deptid; }
            void setdeptName(String deptNamee) {
                this.deptNamee = deptNamee;
            }
            void setlocation(String location) {
                this.location = location;
            }
            int getDeptid(int deptid) { return deptid; }
            String getDeptNamee(String deptNamee) { return deptNamee; }
            String getLocation(String location) { return location; }

            public boolean equals(employee obj) {
                employee e = (employee) obj;
                if (this.id ==e.id) {
                    return true;
                } else
                    return false;
            }
        }
}




