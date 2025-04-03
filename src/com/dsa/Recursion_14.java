package com.dsa;

public class Recursion_14 {
    public static void numbers(int n){
       // Base case
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers(n+1);
    }
    public static int fibonacci(int n) {
        // if(n<2){
      //  return n;
  //  }
        // we can use this instead of the two comparison for n==0 and n==1
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
      //  numbers(1);
        for(int i=0;i<=5;i++){
            System.out.print(fibonacci(i)+" ");
        }

    }
}
