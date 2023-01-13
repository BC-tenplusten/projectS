package model;

import java.util.LinkedList;
import java.util.Scanner;

public class UserList {

    LinkedList<User> list;


    public UserList(){
        list = new LinkedList<>();
    }

    public void add(User user){
        list.add(user);
    }

    public void update(Scanner sc){

        User user = new User();

        System.out.println("Enter ID : ");
        int id = sc.nextInt();

        System.out.println("First Name : ");
        String firstName = sc.nextLine();

        System.out.println("Last Name : ");
        String lastName = sc.nextLine();

        System.out.println("Password : ");
        String password = sc.nextLine();

        System.out.println("Address : ");
        String address = sc.nextLine();

        System.out.println("Phone Number : ");
        String phoneNUmber = sc.nextLine();

        System.out.println("Email : ");
        String email = sc.nextLine();

        user.setId(id);
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPassword(password);
        user.setAddress(address);
        user.setPhoneNumber(phoneNUmber);
        user.setEmailID(email);

        System.out.println("Record updated");
    }

}
