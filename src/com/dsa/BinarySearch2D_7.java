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
    public static int[] binarySearch(int[][] arr,int row,int cStart,int cEnd,int target){
        while(cStart<=cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }else if(arr[row][mid]<target){
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    public static int[] searchIn2DArray(int[][] arr,int target){
        int rows=arr.length;
        int cols=arr[0].length;

        // If there is only one row
        if(rows==1){
            return binarySearch(arr,0,0,arr.length,target);
        }

        int rStart=0;    // lower bound
        int rEnd=rows-1;   // upper bound (search till the last row)
        int cMid=cols/2;   // we will search in middle column

        // Search until there remains only two row
        while(rStart<(rEnd-1)){
            int mid=rStart+(rEnd-rStart)/2;
            if(arr[mid][cMid]==target){
                return new int[]{mid,cMid};
            }else if(arr[cMid][mid]<target){
                // remove the bottom rows
                rEnd=mid;
            }else{
                // remove the upper rows
                rStart=mid;
            }
        }

        // Now we are reduced to two rows
        // check if it is the elements of the middle column
        if(arr[rStart][cMid]==target){
            return new int[]{rStart,cMid};
        }
        if(arr[rStart+1][cMid]==target){
            // check for middle element of second row
            return new int[]{rStart+1,cMid};
        }
        // check for 1st half
        if(target<arr[rStart][cMid-1]){
            return binarySearch(arr,rStart,0,cMid-1,target);
        }
        // check for 2nd half
        if(target>arr[rStart][cMid+1] && target<arr[rStart][cols-1]){
            return binarySearch(arr,rStart,cMid+1,cols-1,target);
        }
        // check for 3rd half
        if(target<arr[rStart+1][cMid-1]){
            return binarySearch(arr,rStart+1,0,cMid-1,target);
        }else{
            // check for 4th half
            return binarySearch(arr,rStart+1,cMid+1,cols-1,target);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. When an array is sorted row wise and column wise
        int[][] arr={
                {10,20,30,40},
                {15,25,35,45},
                {17,28,37,48}
        };
   //     System.out.println("Enter the target : ");
   //     int target=sc.nextInt();
   //     System.out.println(Arrays.toString(search(arr,target)));
        int[][] arr1={
                {1,2,3},
                {4,5,6},
                {7,8,9,10}
        };
        // 2. When an array is sorted
        System.out.println("Enter the target : ");
        int target=sc.nextInt();
        System.out.println(Arrays.toString(searchIn2DArray(arr1,target)));




    }
}
