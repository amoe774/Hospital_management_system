import java.util.*;

public class PatientManager {
    //creating list to store patients
    Scanner sc = new Scanner(System.in);
    private final ArrayList<Patient> patients = new ArrayList<>();

    //checkin if patient id exists in the system
    public boolean ifExists(String id){
        for(Patient p : patients){
            if(p.getId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }

    //method to add patient in the system
    public void addPatient(Patient p){
       if(ifExists(p.getId())){
           System.out.println("Duplicate id detected !!!");
           return;
       }
        patients.add(p);
        System.out.println("patient added");
    }

    //searching patient in the system
    public Patient searchPatient(String id){
        for(Patient p: patients) if(p.getId().equalsIgnoreCase(id))return p;
        return null;
    }

    //method to delete patient from the system
    public void deletePatient(String id){
        for(Patient p : patients){
            if(p.getId().equalsIgnoreCase(id)){
                patients.remove(p);
                System.out.println("Patient deleted successfully!!");
                return;
            }
        }
        System.out.println("Patient id " + id + " not available!!");
    }

    //updating patient using id
    public void updatePatient(){
        System.out.print("Enter patient id to update: ");
        String update = sc.nextLine();

        for(Patient p : patients){
            if(p.getId().equalsIgnoreCase(update)){
                System.out.print("Enter patient id: ");
                String newId = sc.nextLine();
                p.setId(newId);

                System.out.print("Enter patient name: ");
                String newName = sc.nextLine();
                p.setName(newName);

                System.out.print("Enter patient gender: ");
                String newGender = sc.nextLine();
                p.setGender(newGender);

                System.out.print("Enter patient phone: ");
                String newPhone = sc.nextLine();
                p.setPhone(newPhone);

                System.out.print("Enter patient Disease: ");
                String newDisease = sc.nextLine();
                p.setDisease(newDisease);

                System.out.println("Patient updated successfully");

            }

            else{
                System.out.println("No match id found!!");
            }
        }
    }

    //method to view all patients in the system
    public void viewAllPatients(){
        for(Patient p : patients){
            System.out.println(p);
            System.out.println();
        }
    }
}

