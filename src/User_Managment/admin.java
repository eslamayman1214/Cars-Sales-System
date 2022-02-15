package User_Managment;

import cars_sales_system.panals;
import java.util.Scanner;

public class admin extends Person {

    public admin(String username, String password) {
        super("Admin", "1234");
    }

    Scanner Input = new Scanner(System.in);

    @Override
    public void login() {

        System.out.println("Enter Username");
        String user = Input.next();
        System.out.println("Enter Password");
        String pass = Input.next();

        if (user.equals(username) && (pass.equals(password))) {
            System.out.println("**Welcome Admin**");
             panals.admin_panal();

        } else {
            System.out.println("Invalid Username Or Password !! ");
        }
    }
}
