package com.dsa;

import java.util.Arrays;

public class RecursionMergeSort_21 {
    public static int[] mergeSort(int[] arr){
        // base condition
            if(arr.length==1){
                return arr;
            }
              int mid=arr.length/2;
              int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
              int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

              return merge(left,right);  // merges the sorted array from recursive call
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length];
        // pointers for three arrays first,second and mix
        int i=0;
        int j=0;
        int k=0;
        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;  // move for next element in first array
            }else{
                mix[k]=second[j];
                j++;  // move for next element in second array
            }
              k++;  // move for next element in mix array
        }
            // If any of the array finishes and another is remaining
               while(i<first.length){
                   mix[k]=first[i];
                   i++;
                   k++;
               }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
          return mix;
    }

    public static void main(String[] args) {

        int[] arr={8,3,4,12,6,7};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));



        




    }
}
