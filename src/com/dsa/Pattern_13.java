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
    public static void pattern30(int n){
        for(int row=1;row<=n;row++){
            // for printing space
            for(int space=0;space<n-row;space++){
                System.out.print("  ");
            }
             // for printing first half upto 1
            for(int col=row;col>=1;col--){
                System.out.print(col+" ");
            }
            // for printing second half from 2
            for(int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        for(int row=1;row<=n;row++){
             int totalCol=row>n?2*n-row:row;
             for(int space=1;space<=n-row;space++){
                 System.out.print(" ");
             }
             for(int col=totalCol;col>=1;col--){
                 System.out.print(col);
             }
             for(int col=2;col<=totalCol;col++){
                 System.out.print(col);
             }
            System.out.println();
        }
    }
    public static void pattern31(int n){
        int originalN=n;
        n=2*n;
        for(int row=0;row<=n;row++){
            for(int col=0;col<=n;col++){
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
         for(int row=0;row<=n;row++){
             for(int space=0;space<n-row;space++){
                 System.out.print(" ");
             }
             for(int col=0;col<1+2*row;col++){
                 System.out.print("*");
             }
             System.out.println();
         }
    }
    public static void pattern10(int n){
        for(int row=0;row<n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int row=0;row<=n;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }

            for(int col=0;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=0;row<=n;row++){
            for(int space=0;space<n-row;space++){
                System.out.print(" ");
            }
            for(int col=0;col<=row;col++){
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

        // 8.
          //    pattern8(4);

        // 10.
       // pattern10(4);

        // 12. solved but not using appropriate way
       // pattern12(4);

        // 17.
       // pattern17(4);

        // Remaining question from 5 needs to be done here

        // 28.
       // pattern28(4);

        // 30.
      //  pattern30(4);

        // 31.
     //   pattern31(4);



    }
}
