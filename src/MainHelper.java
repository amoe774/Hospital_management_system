import java.util.Scanner;

public class MainHelper extends Main {
    static Scanner sc = new Scanner(System.in);

    PatientManager p_manager = new PatientManager();
    DoctorManager  d_manager = new DoctorManager();


    //loading methods to the main class
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

    @Override
    void load_doctor(){
        while (true){
            //creating doctors main menu

            System.out.println("\nWELCOME TO DOCTORS DASHBOARD");

            System.out.println("1. Add doctor");
            System.out.println("2. Search doctor");
            System.out.println("3. Delete doctor");
            System.out.println("4. Update doctor");
            System.out.println("5. View all doctors");
            System.out.println("6. Main menu");


            //getting user input
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){

                case 1:
                    //adding doctor to the system
                    System.out.print("Enter doctor id: ");
                    String id = sc.nextLine();
                    System.out.print("Enter doctor name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter doctor specialization: ");
                    String spec = sc.nextLine();
                    System.out.print("Enter doctor phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter doctor email: ");
                    String mail = sc.nextLine();

                    Doctor docs = new Doctor(id,name,spec,phone,mail);
                    d_manager.addDoctor(docs);
                    break;

                case 2:
                    //searching doctor in the system
                    System.out.print("Enter doctor id to search: ");
                    String pId = sc.nextLine();

                    Doctor found = d_manager.searchDoctor(pId);

                    if(found != null){
                        System.out.println(found);
                    }else{
                        System.out.println("Doctor not available in the system!!");
                    }
                    break;

                case 3:
                    System.out.print("Enter doctor id to delete: ");
                    String deleteId = sc.nextLine();
                    d_manager.deleteDoctor(deleteId);
                    break;
                case 4:
                    d_manager.updateDoctor();
                    break;
                case 5:
                    d_manager.viewAllPatients();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Please choose fro the menu!!");

            }
        }
    }


}
