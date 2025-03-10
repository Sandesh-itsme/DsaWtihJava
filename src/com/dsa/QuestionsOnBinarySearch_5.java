package com.dsa;
import java.util.Scanner;

public class QuestionsOnBinarySearch_5 {
    public static int CeilingNumber(int[] arr,int item){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>item){
                end=mid-1;
            }else if(arr[mid]<item){
                start=mid+1;
            }else{
               return mid;
            }
        }
        return start;
    }
    public static int FloorNumber(int[] arr,int item){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>item){
                end=mid-1;
            }else if(arr[mid]<item){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
    public static char greaterElement(char[] arr,char element){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<element){
                 start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return arr[start % arr.length];
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. Ceiling number
        int []arr={1,2,3,4,5,16,17};
      //  System.out.println("Enter the item : ");
      //  int item=sc.nextInt();
       // System.out.println(CeilingNumber(arr,item));
         // 2. Floor number
      //  System.out.println(FloorNumber(arr,item));
        // 3. Return the character just greater than the given character
        char[] arr1={'a','b','c','f','j'};
        char element='a';
        System.out.println(greaterElement(arr1,element));







    }
}
