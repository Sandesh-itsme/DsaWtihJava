package com.dsa;

public class Singleton_27 {
    // Singleton classes can have only one object.All the reference variable will point to the same object.
    // We will access this from Car_27.

    public static class Singleton{
        private Singleton(){

        }
        private static Singleton instance;
        public static Singleton getInstance(){
            if (instance==null){
                instance=new Singleton();
            }
            return instance;
        }
    }
    }

