package com.package1;

import java.util.Arrays;
import java.util.List;

 class Person implements Comparable<Person> {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age > o.age)
            return 1;
        else if (this.age == o.age)
            return 0;
        else
            return -1;
    }

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Max", 18),
                new Person("Peter", 23),
                new Person("Pamela", 23),
                new Person("David", 12));

        persons.stream()
                .filter(s -> s.name.startsWith("P"))
                .forEach(s -> System.out.println(s.name));

        persons.stream()
                .sorted()
                .forEach(s -> System.out.println(s.name));

    }
}


