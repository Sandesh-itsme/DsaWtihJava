package com.dsa;

import java.util.ArrayList;
import java.util.List;

public class CyclicSortQuestions_11 {
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
        // case 2 : if the missing number is n
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


    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 6, 8};
        //  System.out.println(missingNumber(arr));
        //  System.out.println(disappearedNumber(arr));
        System.out.println(CyclicSortQuestions_11.duplicateNumber(arr));

    }
}
