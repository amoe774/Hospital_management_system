import java.util.*;

public class DoctorManager {
    Scanner sc = new Scanner(System.in);

    //creating arraylist to store doctors
    private final ArrayList<Doctor> doctors = new ArrayList<>();

    //checkin if doctor exist in the system
    public boolean ifExists(String id){
        for(Doctor d : doctors){
            if(d.getId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }

    //method to add doctor in the system
    public void addDoctor(Doctor d){
        if(ifExists(d.getId())){
            System.out.println("Duplicate id detected !!!");
            return;
        }
        doctors.add(d);
        System.out.println("Doctor added successfully");
    }

    //searching doctor in the system
    public Doctor searchDoctor(String id){
        for(Doctor d: doctors) if(d.getId().equalsIgnoreCase(id))return d;
        return null;
    }

    //method to delete doctor from the system
    public void deleteDoctor(String id){
        for(Doctor d : doctors){
            if(d.getId().equalsIgnoreCase(id)){
                doctors.remove(d);
                System.out.println("Doctor deleted successfully!!");
                return;
            }
        }
        System.out.println("Doctor id " + id + " not available!!");
    }

    //updating doctor using id
    public void updateDoctor(){
        System.out.print("Enter Doctor id to update: ");
        String newDoc = sc.nextLine();

        for(Doctor d : doctors){
            if(d.getId().equalsIgnoreCase(newDoc)){
                System.out.print("Enter doctor id: ");
                String newId = sc.nextLine();
                d.setId(newId);

                System.out.print("Enter doctor name: ");
                String newName = sc.nextLine();
                d.setName(newName);

                System.out.print("Enter doctor specialization: ");
                String newSpec = sc.nextLine();
                d.setSpecialization(newSpec);

                System.out.print("Enter doctor phone: ");
                String newPhone = sc.nextLine();
                d.setPhone(newPhone);

                System.out.print("Enter doctor Email: ");
                String newMail = sc.nextLine();
                d.setEmail(newMail);

                System.out.println("Doctor updated successfully");

            }
        }
        System.out.println("No doctor id match found in the system!!");
    }

    //method to view all doctors in the system
    public void viewAllPatients(){
        for(Doctor d : doctors){
            System.out.println(d);
            System.out.println();
        }
    }

}




