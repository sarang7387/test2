package acceessmodifire1;


//protected access modifire----- we this is accesible for within classes or same pacage diffrent class.
//we canot ust to across the pacge.But an use relation(extends the class)then using childe class object we achived to those protected methode.
public class test2 {
    private void m2() {
        System.out.println("clasa test2 is running");
        
    }
    public static void main(String[] args) {
        
         test1 t2 = new test1();    //.....it can be accessible because : "same package : accessmodifire1" and ust to protected methode.
         t2.m1();
         //t2.m2();.............we canot achive this method using other class object

         test2 t11= new test2();
         t11.m2();

         //simple s =new simple(); //.............because test2  not "extend" and "IMPORT" with simple.it can be not accessible because : "diffrent package : accessmodifire2"
          //s.name();
    }
}


// sencond changes added in git hub