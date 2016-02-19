package Chen.ui;

import java.util.Scanner;

public class Console {

    private static Scanner sc = new Scanner(System.in);
    public static void displayLine() {
        System.out.println();
    }

    public static void displayLine(String s) {
        System.out.println(s);
    }

    public static String getChoice(String prompt) {
        String s = "";
        boolean i = false;
        while (!i) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
                i = true;
            } else {
                System.out.println("Error! Please enter y or n. Try again.");
            }
        }
        return s;
    }

    public static String getCE(String prompt) {
        String s = "";
        boolean i = false;
        while (!i) {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.equalsIgnoreCase("C") || s.equalsIgnoreCase("E")) {
                i = true;
            } else {
                System.out.println("Error! Please enter c or e. Try again.");
            }
        }
        return s;
    }

    public static String getSSN(String prompt)
    {
        String s = "";
        boolean i = false;
        while (!i)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.matches("^(?!000|666)[0-8][0-9]{2}-(?!00)[0-9]{2}-(?!0000)[0-9]{4}$"))
            {
                i = true;
            }
            else
            {
                System.out.println("Error! Please enter valid social security number");
            }
        }
        return s;
    }

    public static String getEmail(String prompt)
    {
        String s = "";
        boolean i = false;
        while (!i)
        {
            System.out.print(prompt);
            s = sc.nextLine();
            if (s.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$"))
            {
                i = true;
            }
            else
            {
                System.out.println("Error! Please enter valid email address");
            }
        }
        return s;
    }
}