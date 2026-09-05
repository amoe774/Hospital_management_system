
import java.util.*;

public abstract class Main{
   static  Scanner sc = new Scanner(System.in);
     abstract void  load_patient();
     abstract void load_doctor();
     abstract void load_appointment();


     //FUTURE UPDATES
    //add maximum doctor number in hospital and patients
    //number of rooms occupied by patients
    //
     public static void main(String[]args){
         boolean isRunning = true;
        MainHelper m1 = new MainHelper() ;

        while (isRunning){
            System.out.println("\n --WELCOME TO HOSPITAL DASHBOARD MENU--");
            System.out.println("1.Patients");
            System.out.println("2.Doctors");
            System.out.println("3.Appointments");
            System.out.println("4.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    m1.load_patient();
                    break;
                case 2:
                    m1.load_doctor();
                    break;
                case 3:
                 m1.load_appointment();
                   break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("opps wrong choice!!");

            }
        }

    }
}