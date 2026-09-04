import java.time.*;

public class Appointment {
    private String aptId,status;
    private LocalTime time;
    private LocalDate date;
    private Patient patient;
    private Doctor doctor;

    public Appointment(String aptId,Patient patient,Doctor doctor,LocalTime time,LocalDate date){
        this.aptId = aptId;
//        this.disease = disease;
        this.time = time;
        this.date = date;
        this.patient = patient;
        this.doctor = doctor;
        this.status = "BOOKED";
    }

    public String getAptId(){
        return aptId;
    }
    public LocalTime getTime(){
        return time;
    }
    public LocalDate getDate(){
        return date;
    }
    public String getStatus(){
        return status;
    }
    public Patient getPatient(){
        return patient;
    }
    public Doctor getDoctor(){
        return doctor;
    }


    public void setAptId(String aptId) {
        this.aptId = aptId;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    @Override
    public String toString() {
        return "\nAppointmentId: " + aptId +
                "\nPatient: " + patient.getId() + patient.getName() +
                "\nDoctor: " + doctor.getId() + doctor.getName() +
                "\nTime: " + time +
                "\nDate: " + date +
                "\nStatus: " + status;
    }
}
