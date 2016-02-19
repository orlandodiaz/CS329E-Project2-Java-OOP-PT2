package Chen.ui;

import java.util.Scanner;

import Chen.business.Customer;
import Chen.business.Employee;

public class PersonApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Welcome to the Person Tester application");
        System.out.println();

        // perform 1 or more selections
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            String CE = Console.getCE("Create customer or employee? (c/e):  ");
            if (CE.equalsIgnoreCase("c")){
                Customer c = new Customer();
                System.out.print("Enter first name: ");
                c.setFirstName(sc.nextLine());
                System.out.print("Enter last name: ");
                c.setLastName(sc.nextLine());
                c.setEmail(Console.getEmail("Enter email address: "));
                System.out.print("Customer number: ");
                c.setCustomerNum(sc.nextLine());
                System.out.println("\nYou entered:");
                System.out.println(c.getDisplayText());
            }
            else if (CE.equalsIgnoreCase("E")){
                Employee e = new Employee();
                System.out.print("Enter first name: ");
                e.setFirstName(sc.next());
                System.out.print("Enter last name: ");
                e.setLastName(sc.next());
                e.setEmail(Console.getEmail("Enter email address: "));
                e.setSSN(Console.getSSN("Social security number: "));
                System.out.println("\nYou entered:");
                System.out.println(e.getDisplayText());
            }



            // see if the user wants to continue

            choice = Console.getChoice("Continue? (y/n): ");
            System.out.println();
        }
    }
}