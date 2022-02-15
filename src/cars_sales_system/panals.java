package cars_sales_system;

import User_Managment.admin;
import User_Managment.user;
import java.util.Scanner;

public class panals {

    static Scanner input = new Scanner(System.in);

    public static void main_panal() {
        admin Admin = new admin("Admin", "1234");
        user User = new user("", "");
        char x;
        System.out.println("        **       Welcome To Car Sales Management System      **       ");
        System.out.println("1- Login As Admin");
        System.out.println("2- Login As User");
        System.out.println("3- Signup For Users");
        System.out.println("4- Exit");
        x = input.next().charAt(0);

        switch (x) {
            case '1':
                Admin.login();
               
                break;
            case '2':
                User.login();
              
                break;
            case '3':
                user.signup();
                //We Dont Need TO call User(object) to Call an Method because The Method is  Decalared  Static.
                panals.main_panal();
                break;
            case '4':
                System.out.println("Thanks For Using Our System :)");
                System.exit(0);
        }
    }

    public static void admin_panal() {
        System.out.println("--  Admin Panal -- ");
        System.out.println("-------------------------------------------------------");
        System.out.println("1- Add Car");
        System.out.println("2- Edit Car ");
        System.out.println("3- Delete Car");
        System.out.println("4- Car Lists");
        System.out.println("5- Logout");

        Scanner input = new Scanner(System.in);
        int y = input.nextInt();

        switch (y) {
            case 1:
                car.addcar();
                System.out.println("To Return To Admin Pannal Press 1 ");
                int o = input.nextInt();
                if (o == 1) {
                    panals.admin_panal();
                }
                break;
            case 2:
                car.edit();
                System.out.println("To Return to Admin Pannal Press 1 ");
                int p = input.nextInt();
                if (p == 1) {
                    panals.admin_panal();
                }
                break;
            case 3:
                car.delete();
                System.out.println("To Return To Admin Pannal Press 1 ");
                int n = input.nextInt();
                if (n == 1) {
                    panals.admin_panal();
                }
                break;
            case 4:
                car.Display();
                System.out.println("To Return To Admin Pannal Press 1 ");
                int k = input.nextInt();
                if (k == 1) {
                    panals.admin_panal();
                }
                break;
            case 5:
                panals.main_panal();
                break;
        }
    }

    public static void user_panal() {
        System.out.println("-- User Panal --  ");
        System.out.println("-------------------------------------------------------");
        System.out.println("1- Search  ");
        System.out.println("2- Display");
        System.out.println("3- Buy a car ");
        System.out.println("4- Logout");

        int y = input.nextInt();

        switch (y) {
            case 1:
                car.search();
                System.out.println("To Return To User Pannal Press 1 ");
                int o = input.nextInt();
                if (o == 1) {
                    panals.user_panal();
                }
                break;
            case 2:
                System.out.println("Press 1 To Display One Car And 2 To Display All Cars ");
                int z = input.nextInt();
                if (z == 1) {
                    System.out.println("Enter Model Name And Year of Purchase To Search For The Car");
                    System.out.println("Enter Model Name ");
                    String x = input.next();
                    System.out.println("Enter Year of Purchase ");
                    int b = input.nextInt();
                    car.Display(x, b);
                    System.out.println("To Return To User Pannal Press 1 ");
                    int g = input.nextInt();
                    if (g == 1) {
                        panals.user_panal();
                    }
                }
                if (z == 2) {
                    car.Display();
                    System.out.println("To Return To User Pannal Press 1 ");
                    int l = input.nextInt();
                    if (l == 1) {
                        panals.user_panal();
                    }
                }
                break;
            case 3:
                car.buy();
                System.out.println("To Return To User Pannal Press 1 ");
                int v = input.nextInt();
                if (v == 1) {
                    panals.user_panal();
                }
                break;
            case 4:
                panals.main_panal();
                break;
        }
    }
}
