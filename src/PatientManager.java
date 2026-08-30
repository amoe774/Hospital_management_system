import java.util.*;

public class PatientManager {
    //creating list to store patients
    ArrayList<Patient> patients = new ArrayList<>();

    //
    public void addPatient(Patient p){
        patients.add(p);
        System.out.println("patient added");
    }
}
