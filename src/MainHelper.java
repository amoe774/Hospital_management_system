import java.util.Scanner;

public class MainHelper extends Main {
    static Scanner sc = new Scanner(System.in);

    PatientManager p_manager = new PatientManager();


    //loading patient menu to y=the main class
    @Override
     void load_patient(){
        while (true){
            System.out.println("\n--WELCOME TO PATIENT DASHBOARD MENU--");
            System.out.println("1.Add Patient");
            System.out.println("2.Search Patient");
            System.out.println("3.Delete Patient");
            System.out.println("4.Update Patient");
            System.out.println("5.View all Patients");
            System.out.println("6.Main Menu");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    //adding patient to the system
                    System.out.print("Enter patient id: ");
                    String id = sc.nextLine();
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter patient gender: ");
                    String gender = sc.nextLine();
                    System.out.print("Enter patient phone number: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter patient disease: ");
                    String disease = sc.nextLine();

                    Patient manager = new Patient(id,name,gender,phone,disease);
                    p_manager.addPatient(manager);
                    break;
                case 2:
                    //method to search for patient using id
                    System.out.print("Enter patient id to search: ");
                    String searchId = sc.nextLine();

                    Patient found = p_manager.searchPatient(searchId);

                    if(found != null){
                        System.out.println(found);
                    }
                    else{
                        System.out.println("Patient not available in the system!!");
                    }

                    break;
                case 3:
                    //implementing method to delete patient
                    System.out.print("Enter patient id to delete: ");
                    String deleteId = sc.nextLine();
                    p_manager.deletePatient(deleteId);
                    break;
                case 4:
                    //updating patient
                    p_manager.updatePatient();
                    break;
                case 5:
                    p_manager.viewAllPatients();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("please choose from the choice above!!");

            }

        }
    }
}
