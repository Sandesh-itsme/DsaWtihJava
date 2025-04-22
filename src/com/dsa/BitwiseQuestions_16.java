package com.dsa;

public class BitwiseQuestions_16 {
    public static boolean isOdd(int n){
        return (n&1)==1;
    }
    public static int singleRepetition(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            ans=arr[i]^arr[i+1];
        }
        return ans;
    }
    public static int singleInAnArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        // 1. Odd or even
     //   int n=6;
    //    System.out.println(isOdd(n));

        // 2. Number with single repetition in an array
      //  int[] arr={1,2,3,4,3,2,1};
      // System.out.println(singleRepetition(arr));

        // 3. Single no. in an array
     //   int[] arr1={1,-1,2,-2,3,-3,4};
     //   System.out.println(singleInAnArray(arr1));

        // 4. Position of ith bit
        int num= 0b1001001;
        int position=3;
        int ans=num&(1<<(position-1));
        System.out.println((ans != 0) ? 1 : 0);  // It prints 1 or 0 otherwise decimal ma print hunxa

        // 5. Set the ith bit to 1


        // 6.  Reset the ith bit to 0


    }
}
