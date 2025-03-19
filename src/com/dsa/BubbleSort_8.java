package com.dsa;

import java.util.Arrays;

public class BubbleSort_8 {
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            // outer loop runs from 0 until it is sorted
            for(int j=1;j<arr.length-i;j++){
                // inner loop runs from second element to the element which is not sorted
                if(arr[j]<arr[j-1]){
                    // swap if 2nd element is less than 1st element
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,5,3,4,6};
        System.out.println("Before Sorting : ");
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(arr));

    }
}
