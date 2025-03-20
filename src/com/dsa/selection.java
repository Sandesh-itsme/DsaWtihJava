package com.dsa;

public class selection {public static int maxNum(int[] arr, int first, int last) {
    int max = first;  // Start by assuming the first element is the max
    for (int i = first + 1; i <= last; i++) {
        if (arr[i] > arr[max]) {  // Compare values, not indices
            max = i;
        }
    }
    return max;
}

    // Swap elements at positions 'first' and 'second'
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Selection sort implementation
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;  // Find the unsorted part of the array
            int maxNumber = maxNum(arr, 0, last);  // Find the max element in the unsorted part
            swap(arr, last, maxNumber);  // Swap max element with the element at the end of the unsorted part
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 3, 2, 1, 7};

        System.out.println("Before sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        selectionSort(arr);  // Sort the array

        System.out.println("After sorting: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


