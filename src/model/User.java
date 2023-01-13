package model;

import java.util.ArrayList;
import java.util.List;

import static model.Registration.registerUser;

public class User{
    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String phoneNumber;
    private String emailID;
    private String userID;

    public User(String firstName, String lastName, String password, String address, String phoneNumber, String emailID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
    }

    public static List<User> user = new ArrayList<>();

    public void addList(){
        user.add(registerUser);
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    public List<User> getList() {
        return user;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public String getUserID(){
        return userID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setUserID(String userID) {
         userID = emailID;
    }

    @Override
    public String toString() {
        return "register{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailID='" + emailID + '\'' +
                ", userID='" + userID + '\'' +
                '}';
    }
}
