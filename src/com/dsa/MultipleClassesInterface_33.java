package com.dsa;

public class MultipleClassesInterface_33 {
    public static void main(String[] args) {

        mobile m1=new mobile();
        m1.batteryPower();
        m1.playMusic1();
        m1.playVideo1();
        m1.upgrade();
        m1.batteryPower();

    }
}
  interface mp3{
    void playMusic();
    void playVideo();
  }
     interface battery{
    void batteryPower();
     }


     class mp3Player implements mp3{
    @Override
    public void playMusic(){
        System.out.println("Playing music.");
    }
      @Override
      public void playVideo(){
          System.out.println("Playing video.");
      }
     }


       class electrical implements battery{
    @Override
    public void batteryPower(){
        System.out.println("Electrical battery.");
    }
       }


         class solar implements battery{
    @Override
    public void batteryPower(){
                 System.out.println("Solar battery.");
             }
         }

   class mobile{
    private battery b1;
    private mp3 m1=new mp3Player();

    public mobile(){
         b1=new electrical();
    }
      public mobile(battery b1){
        this.b1=b1;
      }
        public void batteryPower(){
        b1.batteryPower();
        }
        public void playMusic1(){
        m1.playMusic();
        }
          public void playVideo1(){
        m1.playVideo();
          }

          public void upgrade(){
        this.b1=new solar();
       }
   }