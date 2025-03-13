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
    public static int peakElement(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start!=end){
            int mid=(start+end)/2;
            if(arr[mid]<arr[mid+1]){
                // we are in increasing order of an array
                start=mid+1;
            }else if(arr[mid]>arr[mid+1]){
                // we are in decreasing part of an array
                // here mid maybe thw answer so we will do end=mid not mid-1
                end=mid;
            }
        }
        // since start and end both holds the possible answer at that time and start==end
        // at last so they are the answer.we can return any of them
        return start; // we can return end also
    }
    public static int ElementInMountainArray(int[] arr,int element){
       int peak=peakElement(arr);
       int firstTry=orderAgnosticBinarySearch(arr,element,0,peak);
       if(firstTry!=-1){
           return firstTry;
       }else{
           return orderAgnosticBinarySearch(arr,element,peak+1,arr.length-1);
       }
    }
    public static int orderAgnosticBinarySearch(int[] arr,int item,int start,int end){
        boolean isAscending=arr[start]<arr[end];
            while(start<=end) {
                int m = (start + end) / 2;
                if (arr[m] == item) {
                    return m;
                }
                if (isAscending) {
                    if (arr[m] > item) {
                        end = m - 1;
                    } else if (arr[m] < item) {
                        start = m + 1;
                    }
                }
             else{
                if (arr[m] > item) {
                    start = m + 1;
                } else if (arr[m] < item) {
                    end = m - 1;
                }
            }
        }
        return -1;
    }
    public static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            // case 1:
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            // case 2
            if(mid<end && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            // case 3
            if(arr[mid]<start){
                end=mid-1;
            }else{
                // case 4
                start=mid+1;
            }
        }
        return -1;
    }
    public static int searchElement(int[] arr,int element){
        int pivot=findPivot(arr);
        if(pivot==-1){
            // array is not rotated so apply normal binary search
            return binarySearch(arr,element,0,arr.length-1);
        }
        if(arr[pivot]==element){
            return pivot;
        }
        if(element>=arr[0]){
            return binarySearch(arr,element,0,pivot-1);
        }
            return binarySearch(arr,element,pivot+1,arr.length-1);
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
      //  System.out.println("Enter the element : ");
      //  int element=sc.nextInt();
      //  System.out.println(ans(arr,element));
        // 6. Peak element in mountain array
    //    int[] arr1={1,2,3,4,3,2,1};
      //  System.out.println(peakElement(arr1));
        // 7. Find element in mountain array
     //   System.out.println("Enter the element : ");
     //   int element=sc.nextInt();
     //   System.out.println(ElementInMountainArray(arr1,element));
        // 8. Search an element in a sorted rotated array
        int[]  arr1={5,6,7,1,2,3};
        System.out.println("Enter the element : ");
        int element=sc.nextInt();
        System.out.println(searchElement(arr1,element));











    }
}
