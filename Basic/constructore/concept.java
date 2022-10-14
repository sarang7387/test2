package Basic.constructore;

public class concept {

    //this is simple and lenthy program.using method.
    String emp_name;
    int emp_id;
    public void m() {
        System.out.println(emp_id);
        System.out.println(emp_name);
    }

    public static void main(String[] args) {
        concept c= new concept();
        c.emp_id= 101;
        c.emp_name = "sarang";
        c.m();
        
        concept a= new concept();
        a.emp_id= 102;
        a.emp_name = "rutu";
        a.m();

        concept b= new concept();
        b.emp_id= 103;
        b.emp_name = "love";
        b.m();
    }
}
