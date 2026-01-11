package com.dsa;

public class ExtendingInterfaces_34 {
    public static void main(String[] args) {
        // One interface can extends another interface(not implement).
        // Interface 1 ---> method1();
        // Interface 2 extends interface 1 ---> method2();
        // Class 3 implements Interface 2 ---> It must have both methods method1() and method2().

        Three t3=new Three();
        t3.one();
        t3.two();
    }
}
   interface One{
    void one();
  }
    interface Two extends One{
    void two();
    }
      class Three implements Two{
    public void one(){
        System.out.println("One of interface one.");
    }
      public void two(){
          System.out.println("Two of interface two.");
      }
      }

