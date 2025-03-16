package com.dsa;
import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch2D_7 {
    public static int[] search(int[][] arr,int target) {
        int rStart = 0;
        int cEnd = arr.length;
        while(rStart < arr.length && cEnd >= 0) {
            if(arr[rStart][cEnd]==target){
                return new int[]{rStart,cEnd};
            }else if(arr[rStart][cEnd]<target){
                rStart++;
            }else{
                cEnd--;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. When an array is sorted row wise and column wise
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {17,28,37,48}
        };
        System.out.println("Enter the target : ");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(search(arr,target)));



    }
}
