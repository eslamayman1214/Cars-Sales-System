package cars_sales_system;

import User_Managment.admin;
import User_Managment.user;
import java.util.Scanner;

public class Cars_sales_system {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        admin Admin = new admin("Admin", "1234");
        user User = new user(" ", " ");
        car.init();
        panals.main_panal();
        char x;
        x = input.next().charAt(0);
        
        switch (x) {
            case '1':
                Admin.login();
                break;
            case '2':
                User.login();
                break;
            case '3':
                user.signup();  //We Dont Need TO call User(object) to Call an Method because The Method is  Decalared  Static.
                panals.main_panal();
                break;
            case '4':
                System.out.println("Thanks For Using Our System  :) ");
                System.exit(0);
            default:
                System.out.println("Sorry , You Must Enter Numbers From 1-4");
                break;
        }

    }
}
