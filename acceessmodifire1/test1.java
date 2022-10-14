package acceessmodifire1;

import accessmodifire2.simple;  //...............we imported class then we can not ust extend keyword

public class test1 extends simple {
    //call test 2 class
    //private void m1() {------this is avalable for within the class.Not use same pacage for outside class or acrooss the package.

        // void m1(){-----default modifire===-----same as the protected modifire
        protected void m1(){//------------ we cthis is accesible for within classes or same pacage diffrent class.
                         //we canot ust to across the pacge.Butan use relation(extends the class)then using childe class object we achived to those protected methode.
        System.out.println("public methode runing");
        
    }
    public static void main(String[] args) {
        test1 t =new test1();
        t.m1();

        test2 t11= new test2();
         //t11.m2();..................because private methode usst

        
        simple s1 =new simple();  //............it can be accessible because EXTENDS them. & its diffrent package also: accessmodifire2"
        s1.name();
        //m1.name();..............this methode are not accesssible
    }
}
//sgdgfdsfgfrbf
//git changes practis