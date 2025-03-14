package com.dsa;
import java.util.Scanner;
public class QuestionsBinarySearchLeetcode_6 {
    public static int squareRoot(int n){
        int start=0;
        int end=n;
        int ans=1;
        while(start<=end){
            int mid=(start+end)/2;
            if(mid*mid==n){
                return mid;
            }else if(mid*mid<n){
                ans=mid;  // may be possible ans
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // 1. Square root of number
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        System.out.println(squareRoot(num));

    }
}
