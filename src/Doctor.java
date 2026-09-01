public class Doctor {
    private String id,name,specialization,phone,email;

    //creating a constructor for the doctor class
    public  Doctor(String id, String name,String specialization,String phone,String email){
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.phone = phone;
        this.email = email;
    }

    //creating getters  to access the private variables
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSpecialization(){
        return specialization;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }

    //creating setters to set new values for the variables
    public void setId(String newId){
        id = newId;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setSpecialization(String newSpecialization){
        specialization = newSpecialization;
    }
    public void setPhone(String newPhone){
        phone = newPhone;
    }
    public void setEmail(String newEmail){
        email = newEmail;
    }

    //to string method to print doctor in String formate
    @Override
    public String toString() {
        return  "DoctorId: " + id +
                "\nDoctorName: " + name +
                "\nDoctorSpecialization: " + specialization +
                "\nDoctorPhone: " + phone +
                "\nDoctorEmail: " + email;

    }
}
