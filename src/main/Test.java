package main;


import static model.Registration.Register;

import model.User;

public class Test
{


    public static void main(String []args)
    {
        Register();

        User user = new User();
        User.addList();
        User.getList();
    }
}

