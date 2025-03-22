package com.dsa;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class CyclicSortQuestionFixed_11 {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];  // index=value;
            // if we get n then it will be ignored so we did arr[i]<arr.length
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        // case 2: if the missing number is n
        return arr.length;
    }

    public static List<Integer> disappearedNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;  // index=value-1 because array is from 1 to n
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
        }
        return ans;
    }
    public static int duplicateNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;  // index=value-1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
    public static List<Integer> allDuplicateNumber(int[] arr){
        int i=0;
        List<Integer>ans=new ArrayList<>();
        while(i<arr.length){
            if(arr[i]!=i+1){
                int correct=arr[i]-1;  // index=value-1;
                if(arr[i]!=arr[correct]){
                    swap(arr,i,correct);
                }else{
                    ans.add(arr[i]);
                }
            }else{
                i++;
            }
        }
        return ans;
    }
    public static int[] setOfMissingNumber(int[] arr){
        int i = 0;
        int []ans={0,0};
        while (i < arr.length) {
            int correct = arr[i]-1;  // index=value-1;
            // if we get n then it will be ignored so we did arr[i]<arr.length
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                ans[0]=arr[j];  // returning the value at that index ie duplicate number
                ans[1]=j+1;   // returning index+1 ie value
                return ans;
            }
        }
        // case 2: if the missing number is n
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
    public static int positiveMissingNumber(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1;
            if (arr[i]>0 && arr[i]<=arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j+1) {
                return j+1;
            }
        }
     //case 2:if the array is sorted from 1 to n then n+1 will be the smallest positive missing number
        return arr.length+1;
    }

public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        // allDuplicateFunction has some mistake

        // Uncomment any of the below lines to test each function
        // System.out.println(missingNumber(arr));
        // System.out.println(disappearedNumber(arr));
      //  System.out.println(CyclicSortQuestionFixed_11.duplicateNumber(arr));
      //     System.out.println(allDuplicateNumber(arr));
       //   System.out.println(Arrays.toString(setOfMissingNumber(arr)));
    System.out.println(positiveMissingNumber(arr));
    }
}

