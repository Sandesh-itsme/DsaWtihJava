package com.dsa;

import java.util.Arrays;

public class CyclicSort_11 {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;  // index=value-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,3,1,2};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        cyclicSort(arr);
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(arr));

    }
}
