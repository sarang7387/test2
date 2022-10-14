package Oops.inheritance.HASRelationship;

public class parent1 {
    public void method5() {
        System.out.println("methode 5 is running");
    }
    public void  parent1() {
        System.out.println("parent method is running");
    }
    public static void main(String[] args) {
        parent1 p1 =new parent1();
        p1.parent1();


        //this is a HAS rellationship thats why created object of second class(not use extend keyword in IS relationship)
        child1 c1 =new child1();
        c1.method4();
    }
    
}
