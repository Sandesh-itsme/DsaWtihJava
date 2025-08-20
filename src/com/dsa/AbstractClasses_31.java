package com.dsa;

public class AbstractClasses_31 {

    public static void main(String[] args) {
      // We cannot create object of abstract class
      //  Country c=new Country();

        Nepal n=new Nepal("Nepal");
        n.name();
        n.normal();
        System.out.println(n.num);

        // Accessing static method of abstract class with class name
        Country.print();

        // Abstract class can be used as reference variable
           Country object=new Nepal("Nepal");
    }
}
abstract class Country{
  String name;
  final int num=10;

  public Country(String name){
      this.name=name;
  }

  //  We cannot create abstract constructor
 // abstract Country();

   // We cannot create abstract static class
  //  abstract static void hello();

  abstract void name();
  public void normal(){
      System.out.println("I am normal method.");
  }
    public static void print(){
        System.out.println("I am static method of abstract class.");
    }
}
      class Nepal extends Country{
          public Nepal(String name) {
              super(name);
          }
          @Override
          public void name(){
              System.out.println("Nepal");
          }

      }

