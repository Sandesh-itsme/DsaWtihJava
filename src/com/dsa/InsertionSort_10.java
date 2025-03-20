package com.dsa;

import java.util.Arrays;

public class InsertionSort_10 {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,4,2,1};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(arr));

    }
}
