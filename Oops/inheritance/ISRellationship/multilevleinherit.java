package Oops.inheritance.ISRellationship;

import java.lang.reflect.Method;

public class multilevleinherit extends child { //we can inherit two class side by side one child or one parent or one grandparent
    @Override                                  // eg. multilevleinhri==chiled class and inherit two other diffrent class
    public void methode3() {
        System.out.println("this is multiLevel inheritance");// que) if you have inheriting one class to another class 
        }                                                      //then both class have same methode name Then how will be execute first====child class methode
    public class parent1 extends child{
        public void methode4() {
            
            System.out.println("this is a maltilevel inheritance parent methode4");
        }
    }
    public static void main(String[] args) {
        multilevleinherit m1 =new multilevleinherit();
        m1.methode1();
        m1.methode3();
    }
}
