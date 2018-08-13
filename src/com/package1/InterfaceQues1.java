package com.package1;

    interface InterfaceQue1 {

        String method2();
        int method3(int a);

    }
    interface InterfaceQues{
        String method2();
        int method3(int a);

    }
    class InterfaceAns implements InterfaceQues,InterfaceQue1{
        public void m1(){
            System.out.println("Return M1");
        }

        public String method2(){

            return "Return M2";
        }
        public   int method3(int a){
            return 4;
        }

        public static void main(String[] args) {
            InterfaceQue1 ia=new InterfaceAns();
            InterfaceQues iv=new InterfaceAns();
            InterfaceAns Ia=new InterfaceAns();
            iv.method2();
            ia.method3(5);
            System.out.println(iv.method2());
        }

    }
