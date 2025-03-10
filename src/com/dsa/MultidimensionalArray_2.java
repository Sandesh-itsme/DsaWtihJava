package com.dsa;
import java.util.Arrays;
public class MultidimensionalArray_2 {
    public static void swap(int[] arr,int index1,int index2){
        int temp;
        temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    public static void main(String[] args) {
     // Declaration of 2 dimensional array
     int[][] arr1={
             {1,2,3},
             {4,5},
             {6,7},
     };
     int[] arr2={1,2,3,4,5};
     // Printing 2 dimensional array
        // 1. Using for loop
 /*       for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr1[i][j]+"\t");
            }
            System.out.println();
        }

        // 2. Using for each loop
        for(int[] a:arr1){
            System.out.println(Arrays.toString(a));
        }
          */
        // 3. Using Arrays.toString()
        for(int i=0;i<arr1.length;i++){
            System.out.println(Arrays.toString(arr1[i]));
        }
        // Reverse an array
        System.out.println("Before reversing : ");
        System.out.println(Arrays.toString(arr2));
        int start=0;
        int end=arr2.length-1;
        while(start<end){
            swap(arr2,start,end);
            start++;
            end--;
        }
        System.out.println("After reversing : ");
        System.out.println(Arrays.toString(arr2));







    }
}
