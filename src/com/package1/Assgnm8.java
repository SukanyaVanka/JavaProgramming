package com.package1;

import java.util.*;

class Hospital {
    String hospitalName;
    Doctor doc;
    Address hospitalAddress;

}
class Doctor{
    int docId;
    String name;
    String specialization;
}
class Address{
    String address1;
    String address2;
    String city;
    String state;
    int zipcode;
        }
class HospitalExmple{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("enter Hospital name and address");
        for (int i = 0; i < 3; i++) {
            String HospitalDetails = sc.next();
            List list = new ArrayList<>();
            list.add(HospitalDetails);
            Iterator it = list.iterator();

            while (it.hasNext()) {
                Object o = it.next();
                if (list.equals(o)) {
                    System.out.println("These are Duplicate Hospital Details ");
                } else {
                    Object o1 = it.next();
                    System.out.println(it.next());
                }
            }
        }
    }
        }


