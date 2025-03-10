package com.dsa;
import java.util.Arrays;
import java.util.Scanner;
public class Array_1 {
    public static void changeArray(int[] arr){
        arr[0]=16;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Declaration of an array
       // 1.
         int [] arr={1,2,3,4};
        // 2.
       // int [] arr=new int[5];
     /*
      System.out.println("Enter array elements : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // Printing array
        // 1. Using for loop
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

        // 2. Using for each loop
        for (int a : arr) {
            System.out.print(a);
        }
         */
        // 3. Using Array.toString()
        System.out.println(Arrays.toString(arr));

        // After changing array
        changeArray(arr);
        System.out.println(Arrays.toString(arr));




    }
}
