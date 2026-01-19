package com.dsa;

public class Generics_36 {
    public static void main(String[] args) {

        CustomArrayList c1=new CustomArrayList();
        c1.add(6);
        c1.add(7);
        c1.add(8);
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
        for(int i=0;i<temp.length;i++){
            temp[i]=data[i];
        }
          data=temp;
        }
  }
