package Basic.constructore;

public class concept2 {
    
//this is time consuming program using constructore.
    String emp_name;
    int emp_id;

    concept2(String emp_name,int emp_id){

        this.emp_id=emp_id;
        this.emp_name=emp_name;
        System.out.println(emp_id);
        System.out.println(emp_name);

    }
   

    public static void main(String[] args) {
        concept2 d= new concept2("sarang",101);
        concept2 e= new concept2("rutu",102);
    
    }
}
