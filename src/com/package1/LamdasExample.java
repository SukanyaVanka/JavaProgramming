package com.package1;

@FunctionalInterface
interface LamdasExample {
    int operate(int a,int b);
}
class dhdf {
    public static void main(String[] args) {
        LamdasExample addition= (a, b)-> a+b;
        LamdasExample subtraction = (a,b) -> a-b;

        LamdasExample le = new LamdasExample() {
            @Override
            public int operate(int a, int b) {
                return 0;
            }
        };

        dhdf obj = new dhdf();

        System.out.println(obj.function(5,6,addition));
        System.out.println(obj.function(11,5,subtraction));
    }

   public int function(int a, int b, LamdasExample operation) {

        return operation.operate(a,b);
   }

}
