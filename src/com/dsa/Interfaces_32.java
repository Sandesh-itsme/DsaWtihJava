package com.dsa;

public class Interfaces_32 {
    public static void main(String[] args) {
    animal a1=new animal();
    a1.loud();
    a1.name();
    a1.speed();
    System.out.println(a1.a);


        // It can implements two interfaces even both have same method because they don't have their body
    // and class implementing them can have their own body.So,it doesn't matter which one it is overriding.

    }
}
  interface sound{
    int a=6;
    void loud();
    void name();
  }
   interface walk{
    void speed();
    void name();
  }
     class animal implements sound,walk{
    @Override
   public void loud(){
        System.out.println("It has medium loudness.");
    }
    @Override
    public void name(){
        System.out.println("It's name is dog.");
    }
    @Override
    public void speed(){
        System.out.println("It has medium speed.");
    }
     }
