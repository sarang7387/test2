package Oops.pollymporphism.overloading;

import java.lang.reflect.Method;

//---------------static pollymorphism--------------
public class overloading1 {

    public void over() {//--------------------methode name are same but parametr argument are diffrent----------
        int a=10,b=6,c;
        c= a+b;
        System.out.println("this is methode 1 running"+c);
        
    }
    public void over(int x) {
         int y=15,z;
        z =  x* y;
        System.out.println("this is methode 2 is running ==" +z);
    }
    public void over(String  a) {
       
        System.out.println("this is methode 3 running =="+a);
    }
    public static void main(String[] args) {
        overloading1 o = new overloading1();
        o.over();
        o.over(15);
        o.over("sarang");
    }
}
