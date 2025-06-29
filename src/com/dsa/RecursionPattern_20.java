package com.dsa;

import java.util.Arrays;

public class RecursionPattern_20 {
    public static void pattern(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            System.out.print("* ");
            pattern(row,col+1);
        }else{
            System.out.println();
            pattern(row-1,0);
        }

    }
      public static void pattern2(int row,int col) {
          // Same as in above pattern here we just print when the function call is removing from stack
          if (row == 0) {
              return;
          }
          if (row > col) {
              pattern(row, col + 1);
              System.out.print("* ");
          } else {
              pattern(row - 1, 0);
              System.out.println();
          }
      }
        public static void bubbleSort(int[] arr,int row,int col){
        if(row==0){
            return;
        }
            if (row > col) {
                 if(arr[col]>arr[col+1]) {
                     // Swapping
                     int temp = arr[col];
                     arr[col] =  arr[col+1];
                     arr[col+1] = temp;
                 }
                    bubbleSort(arr,row,col+1);
            }else{
                bubbleSort(arr,row-1,0);
            }

        }

    public static void main(String[] args) {
      //  pattern(4,0);
      //  pattern2(4,0);
          int[] arr={1,3,2,5,4,7,6};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));




    }
}
