package com.dsa;

import java.util.Arrays;

public class Generics_36 {
    public static void main(String[] args) {

        CustomArrayList c1=new CustomArrayList();
        c1.add(6);
        c1.add(7);
        c1.add(8);

        // Accessing elements  overriding toString() method.
        System.out.println(c1);


        // Accessing elements without overriding toString() method.
//        System.out.println("The size of array is : "+c1.getSize());
//        System.out.println("The value at index 0 is : "+c1.getValue(0));
//        System.out.println("The value at index 1 is : "+c1.getValue(1));
//        c1.setValue(1,8);
//        System.out.println("The value at index 1 after changing  is : "+c1.getValue(1));
//        System.out.println(c1.remove(2));


    }
}

  class CustomArrayList{
    private int []data;
    private static int defaultSize=2; // This is static because it doesn't depend on object.
    private int size=0;

    public CustomArrayList(){
        this.data=new int[defaultSize];
    }
    public void add(int item){
        if(isFull()){
            resize();
        }
        data[size++]=item;
    }
      private boolean isFull(){
        // Array is full if length data is equal to size(index).
        return size==data.length;
      }
        private void resize(){
        int []temp=new int[data.length*2];
        // Copying data from data to temp.
        // We compare i with data.length not with temp.length because temp is double than the size of
        // data.
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
          data=temp;
        }
          public int getValue(int index){
        return data[index];
          }
            public int getSize(){
        return size;
            }
              public int remove(int value){
        int removeData=data[--size];
        return removeData;
              }
                public void setValue(int index,int value){
        data[index]=value;
                }

      @Override
      public String toString() {
          return "CustomArrayList{" +
                  "data=" + Arrays.toString(data) +
                  ", size=" + size +
                  '}';
      }
  }
