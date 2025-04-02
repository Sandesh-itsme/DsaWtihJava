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
    public static void main(String[] args) {
        numbers(1);

    }
}
