
import java.util.*;

public abstract class Main{
   static  Scanner sc = new Scanner(System.in);
     abstract void  load_patient();

    public static void main(String  [] args){
        MainHelper m1 = new MainHelper() ;

        System.out.println("\n --WELCOME TO HOSPITAL DASHBOARD MENU--");
        System.out.println("1.Patients");
        System.out.println("2.Doctors");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                m1.load_patient();
                break;
            case 2:
                return;
            default:
                System.out.println("opps wrong choice!!");

        }

    }
}