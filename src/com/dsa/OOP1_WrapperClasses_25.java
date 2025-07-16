package com.dsa;

public class OOP1_WrapperClasses_25 {
    public static void swap(int n1,int n2){
        int temp=n1;
        n1=n2;
        n2=temp;
    }
    public static void main(String[] args) {
        int a=16;  // This is primitive data type
        Integer b=17;  // This is object

        // Java is pass by value so we cannot swap numbers by using pass by reference.
        // We have to pass object.So the below example will not swap the value of n1 and n2.

          int n1=6;
          int n2=7;
        //   swap(n1,n2);
        //   System.out.println(n1+" "+n2);

        // final keyword in java
        final int c=6;
       // c=7;          not allowed because we cannot reassign value to a final variable

       final Show s1=new Show(6);
        s1.id=7;
        // this is allowed even s1 is final because this is non-primitive data type
        // we can change the value of final variable for non-primitive data type

      //  s1=new Show(16);  this is not allowed because we cannot reassign value to final variable

    }
}
       class Show{
      int id;

      public Show(int id){
          this.id=id;
      }
       }