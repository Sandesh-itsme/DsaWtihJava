package com.dsa;

public class MultipleClassesInterface_33 {
    public static void main(String[] args) {

    }
}
  interface run{
    void speed();
    void distance();
  }
   interface typeOfAnimal{
    void type();
   }
     interface upgradeAnimal{
    void upgrade();
     }
     class power implements run{
    public void speed(){
        System.out.println("It has medium speed.");
    }
      @Override
      public void distance(){
          System.out.println("It can run upto medium distance.");
      }
     }
       class types implements typeOfAnimal{
    @Override
    public void type(){
        System.out.println("It is domestic animal.");
    }
       }
         class upgrades implements upgradeAnimal{
    @Override
    public void upgrade(){
                 System.out.println("");
             }
         }