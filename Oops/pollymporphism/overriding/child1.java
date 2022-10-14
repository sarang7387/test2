package Oops.pollymporphism.overriding;

public class child1 extends parent1 {

    int d =222;
     public void marry(int x) {
         System.out.println("child1-marry to disha...."+x);
     }
     public void marry(int a, int b) {
         System.out.println("child1-marry to rohit..."+a+b);        
     }
     //------------when we use static methode in child or parent class---------------

     public static void marry(int a,int b,int c) {
         System.out.println("child-static methode running");         
     }




     public static void main(String[] args) {

        //------------call childe method to create refrence,object of child1 class-----------
         child1 ch= new child1();
         ch.marry(10);
         ch.marry(88,90);
        //overriding concept not applicable to variables
         System.out.println(ch.d);

        //-------------------call parent methode to create refrence,object of parent class--------
         parent1 p1 =new parent1();
         p1.marry(5);
         p1.marry(55, 45);
        //overriding concept not applicable to variables
        System.out.println(p1.d);

//-------------------parent reffrence can holding child object -child extends parent-------------------
         parent1 pp =new child1();
         pp.marry(20);
         pp.marry(23, 25);

// ---------------these static methode are not be override----------
         pp.marry(30, 40, 50);

//-------overriding concept not applicable to variables-------
        System.out.println(pp.d);
    }
    
}
