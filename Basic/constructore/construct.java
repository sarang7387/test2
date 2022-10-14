package Basic.constructore;
import java.rmi.server.SocketSecurityException;

public class construct {

    //----------------write a simple methode programe----------------

/*public void class1(int a) {

        a=a+10;
        System.out.println("This is class 1 methode"+a);
        
    }
    public void class2(int a) {
        a= a*10;
        System.out.println("This is class 2 methode"+a);
         
    }
    public static void main(String[] args) {
       construct cl =new construct();
       cl.class1(10);
       cl.class2(10);
    }*/

    // -----------------simple constructore programe-----------------
//constructor1 define

    public construct(int x){   
        //this();          // name of the constructore or class to be same
        System.out.println("enter the first constructore");
        System.out.println(x);
    }
    //constructor2 define
    private construct(){
                          // constructore can call another constructore btt diffrent parameter
        this(10);      //WE can use 1 or more constructore but there name is same we can using THIS(); keyword
        System.out.println("THERE ARE SECOND CONSTRUCTORE");
    }
    //define methode
    public void sarang() {
        System.out.println("sarang methode run");
        rutuja();
        System.out.println("running stope the sarang methode");
    }
    public void rutuja() {
        System.out.println("this is rutuja methode");        
        }

    public static void main(String[] args) {
                     //how to create object to the constructore class....
    construct cl = new construct();
//when create object of class then autometically call constructor it mean *****we can creat object of constructore****.

//how to call methode using object
        cl.sarang();
        cl.rutuja();
        
}
}
