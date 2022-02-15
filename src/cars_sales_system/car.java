package cars_sales_system;

import java.util.*;

public class car {

    public int yearofpurchase;
    public String manufacture_type;
    public String modelname;
    public String color;
    public double price;
    public String status = "Available";
    static ArrayList<car> Cars = new ArrayList();

    public car(int yearofpurchase, String manufacture_type, String name, String color, double price) {
        this.yearofpurchase = yearofpurchase;
        this.manufacture_type = manufacture_type;
        this.modelname = name;
        this.color = color;
        this.price = price;
    }

    public static void init() {
        car c = new car(2019, "BMW", "X6", "Black", 2000000.0);
        Cars.add(c);
        car c1 = new car(2005, "merceds", "c180", "red", 2000000.0);
        Cars.add(c1);
        car c2 = new car(2019, "BMW", "X3", "Black", 500000.0);
        Cars.add(c2);
    }

    public static void addcar() {
        Scanner input = new Scanner(System.in);
        Scanner j = new Scanner(System.in);

        System.out.println("How Many Cars You Want To Enter");
        int t = j.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Enter year of purchase");
            int Year = j.nextInt();
            System.out.println("Enter manufacture type");
            String Type = j.next();
            System.out.println("Enter name");
            String Name = j.next();
            System.out.println("Enter color");
            String Color = j.next();
            System.out.println("Enter price");
            double Price = j.nextDouble();
            Cars.add(new car(Year, Type, Name, Color, Price));
            System.out.println("Car Added Successfully ");
        }

    }

    public static void edit() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Choose Which Car You Want To Edit");
        for (int i = 0; i < Cars.size(); i++) {
            System.out.println(i + " " + Cars.get(i).manufacture_type + " " + Cars.get(i).modelname + " " + Cars.get(i).yearofpurchase);
        }

        int v = input.nextInt();
        System.out.println("How Many Things You Want To Edit");
        int t = input.nextInt();
        for (int i = 0; i < t; i++) {

            if (v <= Cars.size()) {
                System.out.println("Please Choose Which Attribute You Want To Edit");
                System.out.println("1)Year of Purchase");
                System.out.println("2)Manufacture Type");
                System.out.println("3)Name");
                System.out.println("4)Color");
                System.out.println("5)Price");
                int m = input.nextInt();
                switch (m) {
                    case 1:
                        System.out.println("Enter The New Data");
                        int newyear = input.nextInt();
                        Cars.get(v).yearofpurchase = newyear;
                        break;
                    case 2:
                        System.out.println("Enter The New Data");
                        String newtype = input.next();
                        Cars.get(v).manufacture_type = newtype;
                        break;
                    case 3:
                        System.out.println("Enter The New Data");
                        String newname = input.next();
                        Cars.get(v).modelname = newname;
                        break;
                    case 4:
                        System.out.println("Enter The New Data");
                        String newcolor = input.next();
                        Cars.get(v).color = newcolor;
                        break;
                    case 5:
                        System.out.println("Enter The New Data");
                        double newprice = input.nextDouble();
                        Cars.get(v).price = newprice;
                        break;
                    default:
                        System.out.println("Sorry , You Must Choose Numbers From 1-5");
                        break;
                }
            } else {
                System.out.println("No information For This Car");
            }
        }
    }

    public static void Display() {
        for (int i = 0; i < Cars.size(); i++) {
            System.out.println("Year of purchase is : " + Cars.get(i).yearofpurchase);
            System.out.println("Manufacture type is : " + Cars.get(i).manufacture_type);
            System.out.println("Name is : " + Cars.get(i).modelname);
            System.out.println("Color is : " + Cars.get(i).color);
            System.out.println("Price is : " + Cars.get(i).price);
            System.out.println("Status is : " + Cars.get(i).status);
        }
    }

    public static void Display(String x, int b) {
        boolean bool = false;
        int u = 0;
        for (int j = 0; j < Cars.size(); j++) {
            if (x.equals(Cars.get(j).modelname) && (b == (Cars.get(j).yearofpurchase))) {
                bool = true;
                u = j;
            }
        }
        if (bool == true) {
            System.out.println("Year of Purchase is : " + Cars.get(u).yearofpurchase);
            System.out.println("Manufacture Type is : " + Cars.get(u).manufacture_type);
            System.out.println("Name is : " + Cars.get(u).modelname);
            System.out.println("Color is : " + Cars.get(u).color);
            System.out.println("Price is : " + Cars.get(u).price);
            System.out.println("Status is : " + Cars.get(u).status);
        } else {
            System.out.println("No Car Exists");
        }
    }

    public static void search() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Press (1) To Search With Manufacture Type  And  (2) For Year of purchase");
        int r = input.nextInt();
        if (r == 1) {
            System.out.println("Enter Manufacture type");
            String manufacturetype = input.next();
            for (int i = 0; i < Cars.size(); i++) {
                if (manufacturetype.equals(Cars.get(i).manufacture_type)) {
                    System.out.println("Year of Purchase is : " + Cars.get(i).yearofpurchase);
                    System.out.println("Manufacture Type is : " + Cars.get(i).manufacture_type);
                    System.out.println("Model Name is : " + Cars.get(i).modelname);
                    System.out.println("Color is : " + Cars.get(i).color);
                    System.out.println("Price is : " + Cars.get(i).price);

                }
            }

        } else if (r == 2) {
            System.out.println("Enter Year of Purchase");
            int year = input.nextInt();
            for (int i = 0; i < Cars.size(); i++) {
                if (year == Cars.get(i).yearofpurchase) {
                    System.out.println("Year of Purchase is : " + Cars.get(i).yearofpurchase);
                    System.out.println("Manufacture Type is : " + Cars.get(i).manufacture_type);
                    System.out.println("Model Name is : " + Cars.get(i).modelname);
                    System.out.println("Color is : " + Cars.get(i).color);
                    System.out.println("Price is : " + Cars.get(i).price);

                }

            }

        } else {
            System.out.println("Invalid Input");
        }

    }

    public static void delete() {
        for (int i = 0; i < Cars.size(); i++) {
            System.out.println(i + " " + Cars.get(i).manufacture_type + " " + Cars.get(i).modelname + " " + Cars.get(i).yearofpurchase);
        }
        System.out.println("Please Choose Which Car You Want To Delete");
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();

        if (g <= Cars.size()) {
            for (int i = 0; i <= Cars.size(); i++) {
                if (g == i) {
                    Cars.remove(i);
                    System.out.println("Car Removed");

                    break;
                }

            }
        } else {
            System.out.println(" Invalid data");
        }

    }

  public static void buy() {
        for (int i = 0; i < Cars.size(); i++) {
            System.out.println(i + " " + Cars.get(i).manufacture_type + " " + Cars.get(i).modelname + " " + Cars.get(i).yearofpurchase);
        }
        System.out.println("Please Choose Which Car You Want To Buy");
        Scanner input = new Scanner(System.in);
        int g = input.nextInt();

        if (g <= Cars.size()) {
            for (int i = 0; i <= Cars.size(); i++) {
               
                if ((Cars.get(i).status.equals("Available"))&& i==g ) {
                   
                    System.out.println("Congratulations !!");
                    Cars.get(i).status = "Not Available";
                    break;
                } 
                
                else if((Cars.get(i).status).equals("Not Available") && i ==g ) {
                    
                    System.out.println(" This Car is Already Sold ");
                    panals.user_panal();
                   
                }
                
                }
        } else {
            System.out.println(" Invalid data");
        }

    }

}
