package com.dsa;

public class MathsForDsa_17 {
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        int c=2;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
        }
        return true;
    }
    public static void sieve(int n,boolean[] prime){
        // false in array means number is prime
       for(int i=2;i*i<=n;i++){
           if(!prime[i]){
               for(int j=i*2;j<n;j=j+i){
                   prime[j]=true;  // making the multiple of primes as not prime
               }
           }
       }
       for(int i=2;i<n;i++){
           if (!prime[i]){
               System.out.print(i+" ");
           }
       }
    }
    public static void main(String[] args) {
        // 1. Prime number
     //   int n=2;
     //   System.out.println(isPrime(n));

        // 2. Prime number from 2 to n
        int n=40;
        boolean[] prime=new boolean[n+1];
        sieve(n,prime);




    }
}
