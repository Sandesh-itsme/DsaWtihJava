package com.dsa;

public class OOP2_PackagesAndStaticClass_27 {
    public static void main(String[] args) {
        Car_27 c1 =new Car_27(100000,"Honda");
        Car_27 c2 =new Car_27(200000,"Suzuki");

        System.out.println(c1.price);
        System.out.println(c1.name);
        System.out.println(c2.price);
        System.out.println(c2.name);

        // accessing static variable

        // c1.num
        // c2.num   This is not good way to access static variable
        System.out.println(Car_27.num+1);
        System.out.println(Car_27.num+1);

     //   greet();  This is non-static method.So,it cannot be accessed from static method ie.main
        // We can create object of main to access non-static method
        OOP2_PackagesAndStaticClass_27 obj=new OOP2_PackagesAndStaticClass_27();
        obj.greet();

    }
    public void greet(){
        System.out.println("I am non-static greet method.");
    }
}
