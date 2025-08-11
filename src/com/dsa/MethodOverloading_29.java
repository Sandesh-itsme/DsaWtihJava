package com.dsa;

public class MethodOverloading_29 {
    public static void method1(int a,int b){
        System.out.println("I am method1 with arguments : "+a+" "+b);
    }
      public static void method2(int a,int b,int c){
          System.out.println("I am method1 with arguments : "+a+" "+b+" "+c);
      }
    public static void main(String[] args) {
        method1(1,2);
        method2(1,2,3);

    }
}
