import java.util.*;
import java.time.*;

public class AppointmentManager{
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public Appointment bookAppointment(List<Patient>patients,List<Doctor>doctors,
                                       String patientId,String doctorId,LocalDate date,LocalTime time){


        //read patient
        Patient foundPatient = null;
        for(Patient p : patients){
            if(p.getId().equalsIgnoreCase(patientId)){
                foundPatient = p;
                break;
            }
        }
        if(foundPatient == null){
            System.out.println("Patient id " + patientId + " not found in the system!!");
            return null;
        }

        //read doctor
        Doctor foundDoctor = null;
        for(Doctor d : doctors){
            if(d.getId().equalsIgnoreCase(doctorId)){
                foundDoctor = d;
                break;
            }
        }
        if(foundDoctor == null){
            System.out.println("Doctor id " + doctorId + " not found in the system!!");
            return  null;
        }

        //make bookings
        String newId = "APT" + (int)(Math.random() * 10000);
        Appointment apt = new Appointment(newId,foundPatient, foundDoctor,time,date);
        appointments.add(apt);
        System.out.println("Appointment added successfully");
        return apt;
    }

    //checkin if apt exists
    public boolean ifExists(String id){
        for(Appointment a : appointments){
            if(a.getAptId().equalsIgnoreCase(id)){
                return true;
            }
        }
        return false;
    }

    public void bookApt(Appointment a){
        if(ifExists(a.getAptId())){
            System.out.println("Error appointment already exists!!");
            return;
        }
        appointments.add(a);
        System.out.println("Appointment added");

    }

}
