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
    public static int product(int n){
        // when the number is single digit
        if(n%10==n){
            return n;
        }
           return n%10*product(n/10);
    }
    public static void passingArgument(int n){
        if (n==0) {
            return;
        }
        System.out.print(n+" ");
     //   passingArgument(n--);      infinite loop of 5 because it first passes 5 then only decrease n
        passingArgument(--n);       // first decrease n then passes
    }
    // variable declared for reversing a number
    static int sum=0;
    public static void reverse(int n){
        // using iteration
//        int rem=0;
//        int sum=0;
//        int i=1;
//        while(n!=0){
//            rem=n%10;
//            sum=rem+(sum*i);
//            n=n/10;
//            if(i==1){
//                i=i*10;
//            }
//        }
//          return sum;

        // using recursion

        int rem=0;
        if(n==0){
            return;
        }
         rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
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
      //  System.out.println(number(1342));

        // 6. Product of a number
       // System.out.println(product(1234));

        // 7. Passing arguments
        //     passingArgument(5);

        // 8. Reverse a number
              reverse(1234);
        System.out.println(sum);

    }
}
