package com.dsa;

import java.util.Arrays;

public class RecursionQuickSort_22 {
    public static void mergeSort(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
          int start=low;
          int end=high;
          int mid=(start+end)/2;
          int pivot=arr[mid];
          while(start<=end){
              while(arr[start]<pivot){
                  start++;
              }
                while(arr[end]>pivot){
                    end--;
                }
                  if(start<=end){
                      // violation condition meets so we need to do swapping
                      int temp=arr[start];
                      arr[start]=arr[end];
                      arr[end]=temp;
                      start++;
                      end--;
                  }
          }
            // now pivot element is at mid
        mergeSort(arr,low,end);
        mergeSort(arr,start,high);

    }
    public static void main(String[] args) {
      int[] arr={5,3,2,1,4,6,7};
   //   mergeSort(arr,0,6);
   //     System.out.println(Arrays.toString(arr));

        // Internal sorting algorithm
             Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));



    }
}
