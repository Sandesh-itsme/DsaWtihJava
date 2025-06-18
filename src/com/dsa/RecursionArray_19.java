package com.dsa;

import java.util.ArrayList;

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
    public static ArrayList<Integer> returnList(int[] arr,int target,int index,ArrayList list){
        if(index==arr.length){
            return list;
        }
          if(target==arr[index]){
              list.add(index);
          }
            return returnList(arr,target,index+1,list);
    }
      public static ArrayList<Integer> returnWithoutArgument(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();

          if(index==arr.length){
              return list;
          }
          // This will contain the answer from that function call only
          if(target==arr[index]){
              list.add(index);
          }
            // This contains answer that has been returned from the below function call

          ArrayList<Integer> ansFromBelow=returnWithoutArgument(arr,target,index+1);
           list.addAll(ansFromBelow);
           return list;
      }
    public static void main(String[] args) {
        //  1. Array is sorted or not
        int[] arr={1,2,3,4,4,5,6,7};
     //   System.out.println(sorted(arr,0));

        // 2. Linear search
       // System.out.println(linearSearch(arr,7,0));

        // 3. Returning an array list
      //  ArrayList<Integer>list=new ArrayList<>();
     //  System.out.println(returnList(arr,4,0,list));

        // 4. Returning an array list without passing array list as an argument
        System.out.println(returnWithoutArgument(arr,4,0));


    }
}
