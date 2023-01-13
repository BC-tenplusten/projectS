package model;


public class User{
    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String address;
    private String phoneNumber;
    private String emailID;



    public User() {}

    public User(int id,String firstName, String lastName, String password, String address, String phoneNumber, String emailID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.emailID = emailID;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
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
                ", userID='" + id + '\'' +
                '}';
    }
}
