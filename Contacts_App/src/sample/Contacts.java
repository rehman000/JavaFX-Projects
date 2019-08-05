package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;


public class Contacts {

    private Image photo;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String emplid;

    // Set First Name:
    public String getFirstName(){ return firstName; }
    // Get First Name:
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    // Set Last Name:
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    // Get Last Name:
    public String getLastName(){ return lastName; }

    // Get Full Name:
    public String getFullName(){
        return lastName + " " + firstName;
    }


    // Set Email:
    public void setEmail(String email) {
        this.email = email;
    }
    // Get Email:

    public String getEmail(){ return email; }


    // Set Phone Number:
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    // Get Phone Number:

    public String getPhoneNumber(){ return phoneNumber; }

    // Set EMPLID:
    public void setEmplid(String emplid){
        this.emplid = emplid;
    }
    // Get EMPLID:

    public String getEmplid(){ return emplid; }

    // Set Photo Image:
    public void setPhoto(Image photo){
        this.photo = photo;
    }
    // Get photo Image:

    public Image getPhoto(){ return photo; }




}
