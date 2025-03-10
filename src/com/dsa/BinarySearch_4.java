package com.dsa;
import java.util.Scanner;
public class BinarySearch_4 {
    public static int binarySearch(int[] arr,int item){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int m=(start+end)/2;
           if (arr[m] > item) {
                end = m - 1;
            } else if (arr[m] < item) {
                start = m + 1;
            } else{
                return m;
            }
        }
        return -1;
    }
    public static int binarySearchDescendingOrder(int[] arr,int item){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int m=(start+end)/2;
            if (arr[m] > item) {
                start = m + 1;
            } else if (arr[m] < item) {
                end = m - 1;
            } else{
                return m;
            }
        }
        return -1;
    }
    public static int orderDiagnosticBinarySearch(int[] arr,int item){
        int start=0;
        int end=arr.length-1;
        int len=arr.length-1;
        if (arr[0] < arr[len]){
            System.out.println("Array is in ascending order.");
            while(start<=end) {
                int m=(start+end)/2;
                if (arr[m] > item) {
                    end = m - 1;
                } else if (arr[m] < item) {
                    start = m + 1;
                } else{
                    return m;
                }
            }
            return -1;
        }else{
            System.out.println("Array is in descending order.");
            while(start<=end) {
                int m=(start+end)/2;
                if (arr[m] > item) {
                    start = m + 1;
                } else if (arr[m] < item) {
                    end = m - 1;
                } else{
                    return m;
                }
            }
            return -1;
        }
        }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1={1,2,3,4};
        int[] arr2={4,3,2,1};
        System.out.println("Enter the item : ");
        int item=sc.nextInt();
       // System.out.println(binarySearch(arr1,item));
       // System.out.println(binarySearchDescendingOrder(arr2,item));
        System.out.println(orderDiagnosticBinarySearch(arr1,item));








    }
}
