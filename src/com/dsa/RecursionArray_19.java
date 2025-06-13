package com.dsa;

public class RecursionArray_19 {
    public static boolean sorted(int[] arr,int index){
        // if it reaches last index
        if(index==arr.length-1){
            return true;
        }
          return arr[index]<arr[index+1]&&sorted(arr,index+1);
    }
    public static int linearSearch(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
          if(arr[index]==target){
              return index;
          }else{
                 return linearSearch(arr,target,index+1);
          }
    }
    public static void main(String[] args) {
        //  1. Array is sorted or not
        int[] arr={1,2,3,4,5,6,7};
     //   System.out.println(sorted(arr,0));

        // 2. Linear search
        System.out.println(linearSearch(arr,7,0));


    }
}
