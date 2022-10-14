package Oops.inheritance.ISRellationship;

import Oops.inheritance.parent;

public class child extends parent {
    public void methode3() {
        System.out.println("this is a child class");   
    }
    public static void main(String[] args) {
        child c= new child();
        c.methode1();

        c.methode2();

        c. methode3();
    }
    
}
