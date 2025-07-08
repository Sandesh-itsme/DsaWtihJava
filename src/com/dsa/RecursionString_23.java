package com.dsa;

public class RecursionString_23 {
    public static void skippingCharacter(String ans,String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
          char word=original.charAt(0);
          if(word=='a'){
              skippingCharacter(ans,original.substring(1));
          }else{
              skippingCharacter(ans+word,original.substring(1));
          }
    }
    public static void main(String[] args) {
      skippingCharacter("","abccda");
    }
}
