package Orlando.ui;
import java.util.Scanner;
import Orlando.business.Account;
/**
 * Created by orlandordiaz on 2/19/16.
 */

public class Console {

    private static Scanner sc = new Scanner(System.in);
    public static String getChoice(String prompt) {
        String s = "";
        boolean i = false;
        while (!i) {
            System.out.print(prompt);
            s = sc.next();
            if (s.equalsIgnoreCase("y") || s.equalsIgnoreCase("n")) {
                i = true;
            } else {
                System.out.println("Error! Please enter y or n. Try again.");
            }
        }
        return s;
    }

    public static String getWD(String prompt) {
        String s = "";
        boolean i = false;
        while (!i) {
            System.out.print(prompt);
            s = sc.next();
            if (s.equalsIgnoreCase("w") || s.equalsIgnoreCase("d")) {
                i = true;
            } else {
                System.out.println("Error! Please enter w or d. Try again.");
            }
        }
        return s;
    }

    public static double getAmount(String prompt) {
        double d = 0;
        while (true) {
            System.out.print(prompt);
            d = sc.nextDouble();

            if (d< 0 ){
                System.out.println("Error!");
            }
            else{
                return d;
            }

        }

    }
}
