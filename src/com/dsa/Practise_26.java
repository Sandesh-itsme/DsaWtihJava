package com.dsa;

public class Practise_26 {
    public static void main(String[] args) {
        // Practising classes getter and setter
              Teacher t1=new Teacher(1,"Ram");

        System.out.println(t1.getId());
        System.out.println(t1.getName());
    }
}
      class Teacher{
          int id;
          String name;

          // Using constructor for get name and set name

          public Teacher(int id,String name){
              this.id=id;
              this.name=name;
          }
          public int getId(){
              return this.id;
          }
          public String getName(){
          return this.name;
          }
      }
