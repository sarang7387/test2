package Basic;
public class forloop {
    
    /*public static void main(String[] args) {
        
        // -----------simpl programe for print reverse piramide in star--------------

        for(int i=1; i<=5;i++){ //horrizontal view (||||)

            for(int j=16; j>=i; j--){ //verticale view (----)

                System.out.print("*");// we can use only print() function not use println()
            }

            System.out.println();
        }
    }
}*/
    
    public static void main(String[] args) {

        // -----------simpl programe for print piramide in star--------------
        for(int i=4; i<=8; i++){

            for(int j=1; j<=i; j++){
                                                  //if(j<=i){
                                                     // System.out.print(" * ");
                                                 // }

                System.out.print(" * ");   // we can use only print() function not use println()
            }
            System.out.println("L"); //go with another line
        }
    }
}
    /*public static void main(String[] args) {

        // --------------If we have a for loop inside the another loop, it is known as nested for loop.----------
        for(int i=1; i<3; i++){

            for(int j=1; j<=3; j++){

                System.out.println(i+"       "+j);
            }
        }
        
    }*/
       
        // -------------simple java programe to use break and continue statement;-------
       /* public static void main(String[] args) {
            
        for(int i=1; i<5; i++){
            for(int j=1; j<4; j++){
                System.out.println("enter the for j loop");
                System.out.println(j);
                //break;
                if(j==2){
                    continue;
                }
            }
            System.out.println("enter the for i loop");
            System.out.println(i);

        }}*/

    
    
//}
