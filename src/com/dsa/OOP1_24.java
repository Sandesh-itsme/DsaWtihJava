package com.dsa;

public class OOP1_24 {
    public static void main(String[] args) {
        // Classes in java
        Student s1=new Student(1,"Ram",90);
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.marks);

        Student s2=new Student();
        System.out.println(s2.roll);
    }
}
  class Student{
    int roll;
    String name;
    int marks;

    // Calling constructor using constructor
      Student(){
          // This is creating new reference variable like Student();
           this(2,"Shyam",91);
      }

    Student(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
  }
