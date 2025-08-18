package com.dsa;

public class accessModifier_30 {
   // accessModifier_30 a=new accessModifier_30();
    int a;
    private int b;
    protected int c;
    public int d;

    // Using getter to access private member
    public int getB(){
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public static void main(String[] args) {
       // Show s=new Show2();
        // These all access modifier can be accessed from the same class
//        System.out.println(s.a);
//        System.out.println(s.b);
//        System.out.println(s.c);
//        System.out.println(s.d);
    }
}

