package com.dsa;

public class finalAndStaticOverriding_29 {
    public static void main(String[] args) {
       Car3 c=new Car3();
       Ev e=new Ev();
       Manual m=new Manual();
       Car3 c2=new Manual();
        Car3.hello();
        Ev.hello();
        Manual.hello();
        c2.hello();




    }
}
 class Car3 {
    // This cannot be overridden.
//      final void name(){
//            System.out.println("I am name of class car2.");
//        }
    void name(){
        System.out.println("I am name of class car2.");
    }
    static void hello(){
        System.out.println("I am hello method of class Car3.");
    }


}
 class Ev extends Car3{
    @Override
    void name(){
        System.out.println("I am name of class ev.");
    }
}
 class Manual extends Car3{
    @Override
    void name(){
        System.out.println("I am name of class manual.");
    }
    // Static method cannot be overridden but can be inherited
    //  @Override
    static void hello(){
        System.out.println("I am hello method of class Manual.");
    }
}
