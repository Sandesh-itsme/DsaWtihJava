package com.dsa;

public class Polymorphism_29 {
    static class Car{
        void name(){
            System.out.println("I am name of class car.");
        }
    }
      static class Ev extends Car{
        void name(){
            System.out.println("I am name of class ev.");
        }
      }
        static class Manual extends Car{
        void name(){
            System.out.println("I am name of class manual.");
        }
      }
    public static void main(String[] args) {
        // This is the example of polymorphism where we have a method name which has same name in all
        // classes but has different form
        Car c=new Car();
        Ev e=new Ev();
        Manual m=new Manual();

        c.name();
        e.name();
        m.name();
    }
}
