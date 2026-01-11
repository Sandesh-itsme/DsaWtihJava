package com.dsa;

public class DefaultAndStaticMethodsInInterfaces {
    public static void main(String[] args) {
        // Interfaces can have default methods which has body and can be accessed by class implementing it
        //  if they don't want to override it . However,they can be overridden if wanted.
        // Interfaces can also  have static methods but they should also have body and is accessed using
        // interface name.


        hello h1=new hello();
        h1.defaultPrint();
        h1.nonDefaultPrint();

        // Accessing static method using interface name.
        demo.staticPrint();

    }
}
  interface demo{
    static void staticPrint(){
        System.out.println("I am static method of demo interface.");
    }
    default void defaultPrint(){
        System.out.println("I am default method of demo interface.");
    }
      void nonDefaultPrint();
  }
    class hello implements demo{
    @Override
    public void nonDefaultPrint(){
        System.out.println("I am non default method of demo interface in class hello.");
    }
//    @Override
//    public void defaultPrint(){
//        System.out.println("Overriding default method of demo interface.");
//    }
    }
