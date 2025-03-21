package com.dsa;

public class CyclicSortQuestions_11 {
    public static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int missingNumber(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct=arr[i];  // index=value;
            // if we get n then it will be ignored so we did arr[i]<arr.length
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j)
            {
                return j;
            }
        }
        // case 2 : if the missing number is n
        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr={3,2,1,0,5};
        System.out.println(missingNumber(arr));
    }
}
