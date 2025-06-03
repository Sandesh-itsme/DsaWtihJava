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
    public static double squareRoot(int num){
        int start=0;
        int end=num;
        double result=0.0;
        int p=3;  // precision till we want our result
        while(start<=end) {
            int mid = (start + end) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (mid * mid < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

            // for decimal part
            double increment = 0.1;
            for (int i = 1; i <= p; i++) {
                while (result * result < num) {
                    result = result + increment;
                }
                // when loops break come back once
                result = result - increment;
                increment = increment / 10;  // for 2nd decimal place and 3rd and so on
            }
         }
        return result;
    }
    public static double newtonRaphson(double n){
        double x=n;  // taking n as initial guess
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<=1){
                break;
            }
            x=root;
        }
        return root;
    }
    public static void main(String[] args) {
        // 1. Prime number
     //   int n=2;
     //   System.out.println(isPrime(n));

        // 2. Prime number from 2 to n
      //  int n=40;
      //  boolean[] prime=new boolean[n+1];
      //  sieve(n,prime);

        // 3. Square root of a number
        // printing up to 3 decimal places
      //  System.out.printf("%.3f",squareRoot(40));

        // 4. Newton raphson method
        System.out.println(newtonRaphson(40));





    }
}
