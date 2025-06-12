package com.dsa;

public class RecursionArray_19 {
    public static boolean sorted(int[] arr,int index){
        // if it reaches last index
        if(index==arr.length-1){
            return true;
        }
          return arr[index]<arr[index+1]&&sorted(arr,index+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(sorted(arr,0));


    }
}
