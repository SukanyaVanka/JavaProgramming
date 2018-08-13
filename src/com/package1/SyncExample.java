package com.package1;

import java.awt.*;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;

public class SyncExample {
    SyncExample s=new SyncExample();

    PrintTable table=new PrintTable();
    PrintTable table2=new PrintTable();

class PrintTable {
    void PrintTable(int a) {
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }

    }
}
    class MyThread extends Thread {
        PrintTable t;

        MyThread(PrintTable t) {
            this.t = t;

        }

        public void run() {
            t.PrintTable(3);
        }
    }
}