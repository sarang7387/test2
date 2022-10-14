package Oops.inheritance;

import Oops.inheritance.HASRelationship.grandparent;

public class parent extends grandparent {
    public void methode2() {
        System.out.println("this is a parent class");   
    }
    public static void main(String[] args) {
        parent p = new parent();
        p.methode2();
    }
    
}
