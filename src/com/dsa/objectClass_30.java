package com.dsa;

public class objectClass_30 {
    int num;
    public objectClass_30(int num){
        this.num=num;
    }
    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        // type casting
        return this.num==((objectClass_30)obj).num;
    }


    public static void main(String[] args) {
           objectClass_30 obj1=new objectClass_30(6);
           objectClass_30 obj2=obj1;
           objectClass_30 obj3=new objectClass_30(6);
           // obj1 and obj2 have hash value because both object are same since obj2 is pointing to obj1.
        //    obj3 have different hash value because it is different object.
        //    we can override it also to print desired value.
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
        System.out.println(obj3.hashCode());

        if(obj1==obj3){
            System.out.println("Object 1 and Object 3 are equal.");
        }
          if(obj1.equals(obj3)){
              System.out.println("Object 1 and Object 3 are equal.");
          }
              // getClass method is used to get details about class
            System.out.println(obj1.getClass().getName());


    }
}
