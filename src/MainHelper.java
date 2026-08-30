import java.util.Scanner;

public class MainHelper extends Main {
    static Scanner sc = new Scanner(System.in);

    PatientManager p_manager = new PatientManager();


    //loading patient menu to y=the main class
     void load_patient(){
        System.out.println("\n--WELCOME TO PATIENT DASHBOARD MENU--");
        System.out.println("1.Add Patient");
        System.out.println("2.Search Patient");
        System.out.println("3.Delete Patient");
        System.out.println("4.Update Patient");
        System.out.println("6.View all Patients");
        System.out.println("5.Main Menu");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                System.out.print("Enter patient name: ");
                String name = sc.nextLine();
                System.out.print("Enter patient gender: ");
                String gender = sc.nextLine();
                System.out.print("Enter patient phone number: ");
                String phone = sc.nextLine();
                System.out.print("Enter patient disease: ");
                String disease = sc.nextLine();

                Patient manager = new Patient(name,gender,phone,disease);
                p_manager.addPatient(manager);
                System.out.println("Patient added with id: ");

                break;
            case 2:
                System.out.println("system update in progress hang tight");
                break;
            case 5:
                return;
            default:
                System.out.println("please choose from the choice above!!");


        }


    }
}
