package com.dsa;

import java.security.spec.RSAOtherPrimeInfo;

public class Car_27 {
    int price;
    String name;
    static int num;

    public Car_27(int price,String name){
        this.price=price;
        this.name=name;
    }
     static class ShowStatic{
         static int a=4;
         static int b;

         // Static  block
         static{
             System.out.println("I am static block.");
             b=a*4;
         }

     }

    public static void main(String[] args) {
        // Static block are run once only for the first object
       ShowStatic s1=new ShowStatic();
        System.out.println(s1.a+" "+s1.b);
        s1.b=s1.b+3;
        System.out.println(s1.a+" "+s1.b);

        // This object will also have same value as above
        ShowStatic s2=new ShowStatic();
        System.out.println(s2.a+" "+s2.b);

    }
}
