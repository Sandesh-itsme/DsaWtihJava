package com.dsa;

public class AnonomyousClass_38 {
    public static void main(String[] args) {
        // We can reference an interface to an object of class like dynamic method dispatch.
//        anonymousInterface a1=new anonymousClass();
//        a1.method1();
//        a1.method2();

        anonymousInterface a2=new anonymousInterface() {
            @Override
            public void method1() {
                System.out.println("Method 1");
            }

            @Override
            public void method2() {
                System.out.println("Method 2");
            }
        };

        a2.method1();
        a2.method2();
    }
}
  interface anonymousInterface{
    void method1();
    void method2();
  }
    class anonymousClass implements anonymousInterface{
   @Override
    public void method1(){
       System.out.println("Method 1");
    }
    @Override
    public void method2(){
        System.out.println("Method 2");
    }
    }
