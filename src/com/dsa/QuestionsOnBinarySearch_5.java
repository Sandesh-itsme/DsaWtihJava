package com.dsa;
import java.util.Arrays;
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
    public static int[] findNumber(int[] arr,int element){
        int[] ans={-1,-1};
        int start=searchNumber(arr,element,true);
        int end=searchNumber(arr,element,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int searchNumber(int[] arr,int element,boolean isFirstNumber){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<element){
                start=mid+1;
            }else if(arr[mid]>element){
                end=mid-1;
            }else{
                ans=mid;
                if(isFirstNumber){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static int ans(int[] arr,int element){
        int start=0;
        int end=1;
        while(element>arr[end]){
            int temp=end+1; // new start which is end+1
            // end = previous end + size of the box * 2  ie. (end-start+1)*2
             end=end+(end-start+1)*2;
             start=temp;
        }
        return binarySearch(arr,element,start,end);
    }
    public static int binarySearch(int[] arr,int element,int start,int end){
        while(start<=end){
        int mid=(start+end)/2;
        if(arr[mid]<element){
            start=mid+1;
        }else if(arr[mid]>element){
            end=mid-1;
        }else{
            return mid;
        }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. Ceiling number
        int []arr={1,2,3,3,4,5,16,17};
      //  System.out.println("Enter the item : ");
      //  int item=sc.nextInt();
       // System.out.println(CeilingNumber(arr,item));
         // 2. Floor number
      //  System.out.println(FloorNumber(arr,item));
        // 3. Return the character just greater than the given character
      //  char[] arr1={'a','b','c','f','j'};
      //  char element='a';
      //  System.out.println(greaterElement(arr1,element));
        // 4. Find the first and last position of a given number in an array
       // System.out.println("Enter the element : ");
       // int element=sc.nextInt();
       // System.out.println(Arrays.toString(findNumber(arr,element)));
           // 5. Position of an  element in an infinite sorted array
        System.out.println("Enter the element : ");
        int element=sc.nextInt();
        System.out.println(ans(arr,element));










    }
}
