package Basic;
import java.util.Scanner;
public class switchstat {
    public static void main(String[] args) {
        //--------------create class object---------------
        Scanner sn = new Scanner(System.in);
        System.out.println("Enter the case number up to 1-7");
        int day = sn.nextInt();
        switch (day) {
            case 1: System.out.println("today is sunday");
                break;
            case 2: System.out.println("today is monday");
                break;
            case 3: System.out.println("today is tuesday");
                break;
            case 4: System.out.println("today is wednesday");
                break;
            case 5: System.out.println("today is thursday");
                break;
            case 6: System.out.println("today is friday");
                break;
            case 7: System.out.println("today is saturday");
                break;

            default: System.out.println("there are no match");
                break;
        }

    }
}
