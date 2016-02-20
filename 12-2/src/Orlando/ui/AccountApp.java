package Orlando.ui;


import java.util.Scanner;


public class AccountApp {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Orlando.business.CheckingAccount acc1 = new Orlando.business.CheckingAccount(1000,1);


        char temp = ' ';
        double amount = 1000;


        System.out.println("Welcome to the Account application");
        System.out.println("Starting Balances");
        Orlando.business.Transactions.deposit(acc1, amount);
        System.out.println("Checking : $"+acc1.getBalance());

        System.out.println("Enter the transactions for the month ");


        do
        {
            System.out.print("Withdrawal or deposit? (w/d) : ");
            char option = sc.next().charAt(0);
            System.out.print("Amount ? ");
            amount = sc.nextDouble();

            if(option == 'w')
            {
                Orlando.business.Transactions.withdraw(acc1, amount);
            }
            else
            {
                Orlando.business.Transactions.deposit(acc1, amount);
            }


            System.out.print("Continue? (y/n) : ");
            temp = sc.next().charAt(0);


        }while(temp == 'y');

        System.out.println("\nMonthly Fees ");
        System.out.println("Checking fee : $"+acc1.subtractMonthlyFee());
        System.out.println("\nFinal Balance ");
        System.out.println("Checking : $"+acc1.getBalance());

    }
}