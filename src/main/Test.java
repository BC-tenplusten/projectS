package main;


import model.User;
import model.UserList;

import java.util.Scanner;

import static model.Registration.Register;

public class Test
{

    public static void main(String []args)
    {

        int option = 0;

        UserList userList = new UserList();

        User user = new User();

        Scanner sc = new Scanner(System.in);

        userList.update(sc);

        do{
            menu.menu();
            option = sc.nextInt();

            switch(option){
                case 1:

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
                    String phoneNumber = sc.nextLine();

                    System.out.println("Email : ");
                    String email = sc.nextLine();

                    user = new User(id,firstName,lastName,password,address,phoneNumber,email);
                    userList.add(user);
                    System.out.println(user.toString());

                    break;

                case 2:

            }

        }while (option!=9);









    }
}

