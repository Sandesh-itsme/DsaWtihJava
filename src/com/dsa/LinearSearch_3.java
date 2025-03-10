package com.dsa;
import java.util.Arrays;
import java.util.Scanner;
public class LinearSearch_3 {
    public static int linearSearch(int[] arr,int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static boolean searchString(String str,char ch){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(ch==str.charAt(i)){
                return true;
            }
        }
      return false;
    }
    public static int searchInRange(int[] arr,int item,int l,int h){
        for(int i=l;i<=h;i++){
            if(arr[i]==item){
                return i;
            }
        }
        return -1;
    }
    public static int[] searchIn2DArray(int[][] arr,int item) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == item) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    public static int findNumber(int[] arr){
        int count=0;
       for(int num:arr){
           if(even(num)){
               count++;
           }
       }
        return count;
    }
    public static boolean even(int num){
        int num1=numberOfDigits(num);
        if(num1%2==0){
            return true;
        }
        return false;
    }
    public static int numberOfDigits(int num){
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
    public static int maxWealth(int[][] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sumOfRow=0;
            for(int j=0;j<arr[i].length;j++){
                sumOfRow=sumOfRow+arr[i][j];
            }
            if(sumOfRow>max){
                max=sumOfRow;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={16,2,37,4};
        String str="hello";
        char ch='e';
        int[][] arr2d={
                {1,2,3},
                {4,5},
                {6,7},
        };
        // 1. Linear search
     //   System.out.println("Enter the item : ");
        //  int item=sc.nextInt();
     //   System.out.println(linearSearch(arr,item));
        // 2. Search in string
     //   System.out.println(searchString(str,ch));
        // 3. Search in the range
     /*   System.out.println("Enter the item,lower range and higher range : ");
        int item=sc.nextInt();
        int low=sc.nextInt();
        int high=sc.nextInt();
        System.out.println(searchInRange(arr,item,low,high));
        // 4. Search in 2 dimensional arrays
        System.out.println("Enter the item : ");
        int item=sc.nextInt();
        int []res=searchIn2DArray(arr2d,item);
        System.out.println(Arrays.toString(res));
        // 5. Total number of numbers with even digits in an array
        System.out.println(findNumber(arr));
         */
        // 6. Max wealth
        System.out.println(maxWealth(arr2d));









    }
}
