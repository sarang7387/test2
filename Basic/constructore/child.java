package Basic.constructore;

public class child extends parent{

    //constructore define
    child(){  //--------------constructore(we can use return type then call methode) are not use return*(voide) type---(eg. public,private,protected,default(modifire/specifire)void(return type) (methode name))
        
        //super(int x); because parent class constructore have a get parameter====parent(int x){...}
        //*a constructore do not follow the inheritance its follow the own rule  constructing chain using super(10);
        super(9);
        System.out.println("this is child constructore running");
    }
    //simple method define
    public void methodechild() {
        System.out.println("running the methodechild methode");
        
    }
    public static void main(String[] args) {
        child c1 = new child();
        c1.methodechild();
        c1.parentmethode();
        
    }
}
