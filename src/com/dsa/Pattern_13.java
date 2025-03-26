package com.dsa;

public class Pattern_13 {
    public static void pattern1(int n){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int row=1;row<=2*n;row++){
            int totalCol=row>n? 2*n-row : row;
            for(int col=1;col<=totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern28(int n){
        for(int row=1;row<=2*n;row++){
            int totalCol=row>n? 2*n-row : row;
            int totalSpace=n-totalCol;
            for(int space=0;space<totalSpace;space++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalCol;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // 1.
     //  pattern1(4);

        // 2.
       // pattern2(4);

        // 3.
      //  pattern3(4);

        // 4.
       // pattern4(4);

        // 5.
       // pattern5(4);

        // 28.
        pattern28(4);

    }
}
