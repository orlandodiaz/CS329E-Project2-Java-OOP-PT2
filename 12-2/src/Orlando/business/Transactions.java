package Orlando.business;
/**
 * Created by orlandordiaz on 2/19/16.
 */
public class Transactions {

    // helper methods for each type of transaction.
    public static void deposit(Orlando.interfaces.Depositable account, double amount) {
        account.deposit(amount);
    }
    public static void withdraw(Orlando.interfaces.Withdrawable account, double amount) {
        account.withdraw(amount);
    }

}
