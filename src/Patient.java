public class Patient {
    private String name,gender,phone,disease;


    public Patient(String name,String gender,String phone,String disease){
        this.name = name;
        this.gender = gender;
        this.phone = phone;
//        this.disease = disease;

    }
    // getters to access th private variables;
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
//    public String getId(){
//        return id;
//    }

    //setters to set new values for the variables

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
        return "Name: " + name +
                "Gender: " + gender +
                "Phone: " + phone +
                "Disease: " + disease;
    }
}
