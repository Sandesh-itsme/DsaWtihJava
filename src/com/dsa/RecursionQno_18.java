package com.dsa;

public class RecursionQno_18 {
    public static void nto1(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        nto1(n-1);
    }
    public static void Rev1(int n){
        if(n==0){
            return;
        }
        Rev1(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
           return n*factorial(n-1);
        }
    }
    public static int sum(int n){
        if(n==0){
            return 0;
        }else{
            return n+sum(n-1);
        }
    }
    public static int number(int n){
        if(n==0){
            return 0;
        }
          return n%10+number(n/10);
    }
    public static void main(String[] args) {
        // 1. Print n to 1
    //    nto1(5);
    //    System.out.println();

        // 2. Print 1 to n
     //   Rev1(5);

        // 3. Factorial of a number
       // System.out.println(factorial(5));

        // 4. Sum of a number
       // System.out.println(sum(4));

        // 5. Sum of digits
        System.out.println(number(1342));

    }
}
