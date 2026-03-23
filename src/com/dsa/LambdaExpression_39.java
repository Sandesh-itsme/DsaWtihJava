package com.dsa;

public class LambdaExpression_39 {
    public static void main(String[] args) {
        // Using lambda expressions to access interface
        Lamda l1=(a)->{
            System.out.println("Method1 "+a+"");
        };
          l1.method1(7);
    }
}
 interface Lamda{
    void method1(int a);
 }
