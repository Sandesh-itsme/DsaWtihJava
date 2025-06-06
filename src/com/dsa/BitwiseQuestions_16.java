package com.dsa;

import java.util.Arrays;

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
    public static int binary(int n){
        int sum=0;
        int i=1;
        int r;
        while(n>0){
            r=n%2;
            sum=sum+r*i;
            i=i*10;
            n=n/2;
        }
        return sum;
    }
    public static double magicalNumber(int n){
        int num=binary(n);
        double sum=0;
        int r;
        int i=1;
        while(num>0){
            r=num%10;
            sum=sum+(r*Math.pow(5,i));
            num=num/10;
            i++;
        }
        return sum;
    }
    public static int optimumMagicalNumber(int n){
        int base=5;
        int ans=0;
        while(n>0){
            int lastDigit=n&1;
             n=n>>1;
            ans=ans+base*lastDigit;
            base=base*5;
        }
        return ans;
    }
    public static int noOfDigits(int n,int b){
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }
    public static int sumOfPascalsTriangle(int n){
        // n=row number
        int ans=1<<(n-1);   // ---> 1*2^(n-1)
        return ans;
    }
    public static boolean powerOfTwo(int n){
        boolean ans;
       ans = (n&(n-1))==0;
       return ans;
    }
    public static int setBits(int n){
        // approach 1
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;

        // approach 2
//        int count=0;
//        while(n>0){
//            count++;
//            n=n&(n-1);  //  n=n-(n&-n);
//        }
//        return count;
    }
    public static int xorFrom0ToA(int a){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        if(a%4==3){
            return 0;
        }
        return -1;
    }
    public static int xorFromAToB(int a,int b){
        int xorB=xorFrom0ToA(b);
        int xorA=xorFrom0ToA(a);
        return xorA^xorB;
    }
    public static int[][] flippingImage(int [][]arr){
        for(int[] row:arr){
            // reversing each row
            for(int i=0;i<(arr[0].length+1)/2;i++){
                int temp=row[i]^1;
                row[i]=row[arr[0].length-i-1]^1;
                row[arr[0].length-i-1]=temp;
            }
        }
        return arr;
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
     //   int num= 0b1001001;
     //   int position=3;
     //   int ans=num&(1<<(position-1));
     //   System.out.println((ans != 0) ? 1 : 0);  // It prints 1 or 0 otherwise decimal ma print hunxa

        // 5. Set the ith bit to 1


        // 6.  Reset the ith bit to 0


        // 7. Magical number
       // System.out.println(binary(6));
       // System.out.println(magicalNumber(6));
     //   System.out.println(optimumMagicalNumber(6));

        // 8. No. of digits in given base
      //  int base=2;
      //  int num=10;
      //  System.out.println(noOfDigits(num,base));

        // 9. Sum of nth row of pascals triangle
      //  int n=3;
      //  System.out.println(sumOfPascalsTriangle(n));

        // 10. Power of 2 or not
     //   int n=8;
     //   System.out.println(powerOfTwo(n));

        // 11. No. of set bits in given number
      //  int n=0b1010;       // for binary representation
      //  System.out.println(setBits(n));

        // 12. Xor from 0 to a
      //  int a=6;
      //  System.out.println(xorFrom0ToA(a));

        // 13. Xor from a to b
      //  int a=3;
     //   int b=9;
     //   System.out.println(xorFromAToB(a,b));

        // 14. Flipping an image
        int [][]arr={{1,0,0},
                      {1,1,0},
                       {0,1,0}};
        System.out.println(Arrays.toString(flippingImage(arr)));








    }
}
