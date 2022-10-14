package Oops.pollymporphism.overriding;

// overriding programe     1)samaja class child ne "parent class" extends kela tar overloading made "parent class" chya all methode execute hotat 
//                            class child made
//                         2)"class child" ne "parent class" extends kerun sudhdha overriding madhe "parent class"aivaji "class child" chya methode
//                         execute hotat tyala methode overriding mhantat

public class child3 extends parent3 {

    //overriding methode
    public void override() { //parent3 or child3 have same methode same parameter

        
        System.out.println("child3- override method");
    }

    public void override(int a) {
        System.out.println("child3-int a override methode");        
    }
    
    public static void main(String[] args) {

        child3 c = new child3();
        c.override(10);
//------------parent reffrence can holding child object -child extends parent----------------
        parent3 p = new child3();
        p.override();// o/p is done by runtime using JVM. thats  why called runtime overriding methode
         
    }
}
