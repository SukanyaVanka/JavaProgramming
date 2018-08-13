package com.package1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {

        FileInputStream obj = new FileInputStream("E:\\InputStreamExample\\in.txt");

        FileOutputStream obj1 = new FileOutputStream("out.txt");

        int c;

        while ((c = obj.read()) != -1) {

            obj1.write(c);


        }



    }

}
