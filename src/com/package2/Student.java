package com.package2;

import java.util.*;

public class Student implements Comparable<Student>, Comparator<Student> {

    int id, fee;
    String name;

    public Student(int id, int fee, String name) {
        this.id = id;
        this.fee = fee;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {

        if (this.id == o.id) {
            return 0;
        }else if(this.id > o.id) {
            return 1;
        }else
            return -1;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fee=" + fee +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Set set = new TreeSet<Student>();

        set.add(new Student(101,1000,"Harish"));
        set.add(new Student(121,1300,"Javvaji"));
        set.add(new Student(103,10200,"Harish"));
        set.add(new Student(103,10200,"Harish 2"));

        Iterator iterator = set.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.id == o2.id)
            return 0;
        else if (o1.id > o2.id)
            return 1;
        else
            return -1;
    }
}
