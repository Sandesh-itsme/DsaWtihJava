package com.dsa;

public class TypesOfInheritance_28 {
    static class parent{
        int num1;
        public parent(int num1){
            this.num1=num1;
        }
    }
     static class derived1 extends parent{
        int num2;
       public derived1(int num1,int num2){
            super(num1);
            this.num2=num2;
        }
      }
           static class derived2 extends derived1{
             int num3;
             public derived2(int num1,int num2,int num3){
                 super(num1,num2);
                 this.num3=num3;
             }
            }
    public static void main(String[] args) {
        parent p=new parent(1);
        derived1 d1=new derived1(1,2);
        derived2 d2=new derived2(1,2,3);

    }
}
