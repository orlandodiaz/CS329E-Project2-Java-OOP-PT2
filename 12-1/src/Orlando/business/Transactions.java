package Orlando.business;
import Orlando.interfaces.*;
/**
 * Created by orlandordiaz on 2/19/16.
 */
public class Transactions {

    // helper methods for each type of transaction.
    public static void deposit(Depositable account, double amount) {
        account.deposit(amount);
    }
    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);
    }

}
