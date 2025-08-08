package com.dsa;

public class Inheritance_28 {
    static class Car{
        // Private parameters cannot be accessed by child class.This can be modified or accessed within the same
        //  class only.
        private int numberPlate;
        float price;
        String name;

        Car(int price,String name){
            this.price=price;
            this.name=name;
        }
          Car(){
            this.price=1000000f;
            this.name="Yamaha";
          }
    }
       static class Yamaha extends Car{
        String color;

        Yamaha(String color){
            this.color=color;
        }
         // Using super keyword to access parent class constructor
          Yamaha(int price,String name,String color){
            super(price,name);  // This will call parent class constructor taking two arguments
            this.color=color;
             //   super(price,name);  Super keyword must be initialised first
          }

    }
    public static void main(String[] args) {
          Car c1=new Car();
          Car c2=new Car(2000000,"Honda");
        System.out.println(c1.name+" "+c1.price);
        System.out.println(c2.name+" "+c2.price);

        // Accessing parent class parameters using base class
            Yamaha y1=new Yamaha("Red");
        System.out.println(y1.name+" "+y1.price+" "+y1.color);





    }
}
