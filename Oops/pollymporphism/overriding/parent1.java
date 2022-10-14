package Oops.pollymporphism.overriding;

public class parent1 {
    int d=111;

    //private void marry(intc){} ----------------we canot be vwrriden==== becaus specifire change public to priate
    //final void marry(){}-------------------final methode perent class canot be overriden.
    public void marry(int a) {
        System.out.println("parent-marry with rutuja..."+a);
    }
    public void marry(int a, int b) {
        System.out.println("parent-marry with sarang..."+a+b);
        
    }
    //--------------when we use static methode given bellow oprention-----------------
    public static void marry(int a,int b,int c) {
        System.out.println("parent-static methode running");         
    }
}
