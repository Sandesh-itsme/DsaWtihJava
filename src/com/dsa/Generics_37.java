package com.dsa;

public class Generics_37 {
    public static void main(String[] args) {
  // In the type T we can pass any variable we want

        customGenerics<Integer> c1 = new customGenerics<Integer>(13);
        customGenerics<String> c2 = new customGenerics<String>("String");

      //  c1.demoVariable="Hello";  This can only contain integer type
         c1.demoVariable=14;   // This is allowed

        System.out.println(c1.getDemoVariable());
        System.out.println(c2.getDemoVariable());



    }
}
  class customGenerics<T>{
    // Created custom generics that takes parameter of type T

      T demoVariable;    // demoVariable of type T

      public customGenerics(T demoVariable){
         this.demoVariable=demoVariable;
      }

      // Using getter to return value of demoVariable
        public T getDemoVariable(){
          return this.demoVariable;
        }

  }
