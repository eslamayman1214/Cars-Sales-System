package User_Managment;

import cars_sales_system.panals;
import java.util.Scanner;

public class user extends Person {

    static user u[] = new user[5];
    static String User, Pass;
    static int counter = 1;
    static boolean log_in = false;

    public user(String username, String password) {
        super(username, password);

    }

    static Scanner input = new Scanner(System.in);

    @Override
    public void login() {

        u[0] = new user("Rawan", "1234");

        System.out.println("Enter Username");
        User = input.next();
        System.out.println("Enter Password");
        Pass = input.next();

        for (int i = 0; i < counter; i++) {
            if (User.equals(u[i].username) && (Pass.equals(u[i].password))) {
                log_in = true;
                System.out.println("Welcome " + u[i].username);
                panals.user_panal();
            }
        }      // end of for loop
        if (log_in == false) {
              System.out.println("Invalid username or password !");
              panals.main_panal();
        }
    }

    public static void signup() {

        System.out.println("Please Enter Your Username");
        String un = input.next();
        System.out.println("Please Enter Your Password");
        String pw = input.next();
        u[counter] = new user(un, pw);
        System.out.println("Account Created Successfully!");
        counter++;
       
    }

}
