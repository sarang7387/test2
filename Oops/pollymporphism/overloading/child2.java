package Oops.pollymporphism.overloading;

public class child2 extends parent {//--------------polllymorphism class extends to other class
    //case-1
    public void name1(int x) {
        System.out.println("child2-int argument method");  
    }
    //case-2
    public void name1(float y) {
        System.out.println("child2-float argument methode");
    }
    //case-3
    public void name1(double z) {
        System.out.println("child2-double argument methode");
    }
    public static void main(String[] args) {

        child2 ch=new child2();//----we have create simple childe2 object using child reffrence

        ch.name1(10);
        //ch.name1(1.5f);
        //ch.name1(10.50);

        //case 4=====because charactore value les than integer value.
        //ch.name1('c');

        //----------------parent reffrence can hold child2 object-when child extends parent----------------------

        //------we can child2 object using parent reffrence in ovrloading concept
        parent p1 =new child2(); 

        //child2 c2 =new parent();-------------------we do not use child refrence parent object concept-------------------- 
        
        p1.method1(10);
        p1.method1(10.5f);//===========called compile time pollymorphism...because these execute the compile time.
        
    }
}
