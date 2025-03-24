package com.dsa;

import java.util.ArrayList;

public class StringAndStringbuilder_12 {
    public static boolean palindrome(String word){
        char[] arr=word.toCharArray();
        for(int i=0;i<word.length()/2;i++){
            char start=arr[i];
            char end=arr[word.length()-1-i];
            if(start!=end){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name="hello";
        // Creating different string class
        String a=new String("hello");
        String b=new String("hello");
      //  System.out.println(name);
        // String Comparison
   //     System.out.println(a==b);
   //     System.out.println(a.equals(b));

        // charAt() functions
     //   System.out.println(a.charAt(0));

        // pretty printing in java
//        float c=123.4567f;
//        System.out.println("The value of c without formatting is : "+c);
//        System.out.printf("The formatted value of c is : %.2f \n",c);
//
//        System.out.println("The value of pie without formatting is :"+Math.PI);
//        System.out.printf("The formatted value of pie is : %.2f",Math.PI);

        // String concatenation
//        System.out.println('a'+'b'); // prints ascii value
//        System.out.println("a"+"b");  // prints ab
//        System.out.println("a"+'b');  // prints ab
//        System.out.println("a"+1);    // prints a1
//
//        // complex data types
//        System.out.println("a"+new ArrayList<>());  // prints a[] bcz arraylist is empty

        // String performance
//        String series="";
//        for(int i=0;i<26;i++){
//            char text=(char)('a'+i);
//            series=series+text;
//        }
//        System.out.println(series);

//        // String builder
//        StringBuilder builder=new StringBuilder();
//        for(int i=0;i<26;i++){
//            char text=(char)('a'+i);
//            builder.append(text);
//        }
//        System.out.println(builder);
//
//        // String methods
//        String word="abcdef";
//        System.out.println(word.indexOf('a'));
//        System.out.println(word.toLowerCase());
//        System.out.println(word.toUpperCase());
//        System.out.println(word.toCharArray());

        // String palindrome
        String word="abcba";
        System.out.println(palindrome(word));






    }
}
