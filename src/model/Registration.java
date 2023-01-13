package model;

import java.util.Scanner;

public class Registration {


    static User registerUser = new User("","","","","","");



    public static void Register(){

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("First Name : ");
            String firstName = sc.nextLine();
            registerUser.setFirstName(firstName);

            System.out.println("Last Name : ");
            String lastName = sc.nextLine();
            registerUser.setLastName(lastName);

            System.out.println("Password : ");
            String password = sc.nextLine();
            registerUser.setPassword(password);

            System.out.println("Address : ");
            String address = sc.nextLine();
            registerUser.setAddress(address);

            System.out.println("Phone Number : ");
            String phoneNUmber = sc.nextLine();
            registerUser.setPhoneNumber(phoneNUmber);

            System.out.println("Email : ");
            String email = sc.nextLine();
            registerUser.setEmailID(email);


        }
    }
}





