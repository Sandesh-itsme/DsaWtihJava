package com.dsa;

public class RecursionPattern_20 {
    public static void pattern(int row,int col){
        if(row==0){
            return;
        }
        if(row>col){
            System.out.print("* ");
            pattern(row,col+1);
        }else{
            System.out.println();
            pattern(row-1,0);
        }

    }
    public static void main(String[] args) {
        pattern(4,0);


    }
}
