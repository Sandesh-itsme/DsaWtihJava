package com.dsa;

public class Recursion_14 {
    public static void numbers(int n){
       // Base case
        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        numbers(n+1);
    }
    public static int fibonacci(int n) {
        // if(n<2){
      //  return n;
  //  }
        // we can use this instead of the two comparison for n==0 and n==1
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static int binarySearch(int[] arr,int target,int start,int end){
        // we are providing start and end in the argument because they are required for sub function
        //  calls

        if(start>end){
            // element is not found
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]<target){
           return binarySearch(arr,target,mid+1,end);
        }
        return binarySearch(arr,target,start,mid-1);
    }
    public static void main(String[] args) {
      //  numbers(1);

        // fibonacci series using recursion

      //  for(int i=0;i<=5;i++){
      //      System.out.print(fibonacci(i)+" ");
      //  }

        // binary search using recursion
              int[] arr={1,2,3,4,5,6};
              int target=3;
              System.out.println(binarySearch(arr,target,0,arr.length-1));

    }
}
