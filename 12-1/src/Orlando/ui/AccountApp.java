package Orlando.ui;

import java.util.Scanner;
import Orlando.business.Account;
import Orlando.business.CheckingAccount;
import Orlando.business.Transactions;

public class AccountApp {
    public static void main(String[] args) {



        Account acc1 = new Account();
        acc1.setBalance(1000);






        System.out.println("Welcome to the Account Calculator\n");
        System.out.println("Starting Balance");
        System.out.println("Checking: "+acc1.getBalanceFormatted());

        System.out.println("\nEnter the transactions for the month\n ");

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            double amount = 0;
            String option = Console.getWD("Withdrawal or deposit? (w/d) : ");
            if(option.equalsIgnoreCase("w"))
            {
                amount = Console.getAmount("Amount: ");
                Transactions.withdraw(acc1, amount);
            }
            else
            {
                amount = Console.getAmount("Amount: ");
               Transactions.deposit(acc1, amount);
            }
            choice = Console.getChoice("\nContinue? (y/n) : ");
            System.out.println();
        }
        CheckingAccount ca = new CheckingAccount();
        ca.setMonthlyFee(1);
        acc1.setBalance(acc1.getBalance()-ca.getMonthlyFee());
        System.out.println("\nMonthly Fees ");
        System.out.println("Checking fee: "+ca.getMonthlyFeeFormatted());
        System.out.println("\nFinal Balance ");
        System.out.println("Checking: "+ acc1.getBalanceFormatted());




    }
}