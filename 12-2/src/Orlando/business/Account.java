package Orlando.business;

/**
 * Created by orlandordiaz on 2/19/16.
 */
public class Account implements Orlando.interfaces.Depositable, Orlando.interfaces.Withdrawable, Orlando.interfaces.Balanceable {
    
    
    private double balance;
    /**
     * Constructs a default Account with given balance.
     */
    protected Account(double balance) {
        balance = 1000;
    }

    /* Define the method for obtaining an Account's balance. */
    @Override
    //public final double before
    public double getBalance() {
        return balance;
    }

    /* Define the method for modifying an Account's balance. */
    @Override
    public final void setBalance(double amount) {
        balance = amount;
    }

    /*add the amount to the balance when depositing. */
    @Override public void deposit(double amount) {
        // Validations

        if(amount > 10000)
        {
            System.out.println("You can't deposit more than $10,000 per transaction.");
        }
        else
        {
            balance = balance + amount;
        }
    }

    /* subtract the amount to the balance when depositing. */
    @Override
    public void withdraw(double amount) {

        // Validate
        if(balance < amount)
        {
            System.out.println("You can't withdraw more than your current account balance.");
        }
        else
        {
            balance = balance - amount;
        }
    }




}