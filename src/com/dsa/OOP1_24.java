package com.dsa;

public class OOP1_24 {
    public static void main(String[] args) {
        // Classes in java
        Student s1=new Student(1,"Ram",90);
//        System.out.println(s1.roll);
//        System.out.println(s1.name);
//        System.out.println(s1.marks);

        Student s2=new Student();
//        System.out.println(s2.roll);

        Student s3=new Student(s1);
        System.out.println(s3.name);
        System.out.println(s3.roll);
        System.out.println(s3.marks);
    }
}
  class Student{
    int roll;
    String name;
    int marks;

    // Calling constructor using constructor . Here Student is a empty constructor . Using this keyword we are
    //  calling another constructor which takes 3 arguments

      Student(){
          // This is creating new reference variable like Student();

           this(2,"Shyam",91);
          //        So what did this in default constructor help with?
//                It provides default values.
//                Think of it like this:
//“If someone creates a Student without giving any info,
//                I’ll automatically give them rollno = 2 and name = Ram.”

      }

      // Passing another object of same class in argument of constructor
      Student(Student anotherConstructor){
          this.roll=anotherConstructor.roll;
          this.name=anotherConstructor.name;
          this.marks=anotherConstructor.marks;
      }

    Student(int roll,String name,int marks){
        this.roll=roll;
        this.name=name;
        this.marks=marks;
    }
  }
