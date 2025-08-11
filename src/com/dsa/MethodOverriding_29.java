package com.dsa;

public class MethodOverriding_29 {
    static class Car2{
        void name(){
            System.out.println("I am name of class car2.");
        }
    }
    static class Ev extends Car2{
        void name(){
            System.out.println("I am name of class ev.");
        }
    }
    static class Manual extends Car2{
        void name(){
            System.out.println("I am name of class manual.");
        }
    }
    public static void main(String[] args) {
        Car2 c=new Manual();
        // ParentClass object = new ChildClass();

        c.name();
        // There must method name in both Car2 and Manual class.
        // But the method of Manual class will run because the object of which reference variable is created
        // determines which method runs.
        // The reference variable determines which method can be accessed.


    }
}
