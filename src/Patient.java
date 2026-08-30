public class Patient {
    private String id,name,gender,phone,disease;


    public Patient(String id,String name,String gender,String phone,String disease){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.disease = disease;


    }
    // getters to access th private variables;
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public String getPhone(){
        return phone;
    }
    public  String getDisease(){
        return disease;
    }


    //setters to set new values for the variables
    public void setId(String newId){
        id = newId;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setGender(String newGender){
        gender = newGender;
    }
    public void setPhone(String newPhone){
        phone = newPhone;
    }
    public void setDisease(String newDisease){
        disease = newDisease;
    }
//    public void setId(String newId){
//        id = newId;
//    }

    @Override
    public String toString(){
        return "\nPatientId: " + id +
                "\nName: " + name +
                "\nGender: " + gender +
                "\nPhone: " + phone +
                "\nDisease: " + disease;
    }
}
