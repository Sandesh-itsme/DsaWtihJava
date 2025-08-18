package hello;

import com.dsa.accessModifier_30;

public class access extends accessModifier_30{
    public static void main(String[] args) {
        accessModifier_30 access1=new accessModifier_30();
        access access2=new access();

       //  int n1=access2.a;  Since a has default modifier so it cannot be accessed from different package.
           int n2= access2.getB();  // Since b has private modifier so we use getter setter to access it.
           int n3=access2.c;        // Since access is the subclass of accessModifier_30 so we can access
                                    // protected member from different package also
           int n4=access2.d;        // Since d has public modifier so it can be accessed from anywhere.


    }
}
