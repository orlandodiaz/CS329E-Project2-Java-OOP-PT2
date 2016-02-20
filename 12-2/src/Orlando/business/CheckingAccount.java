package Orlando.business;

/**
 * Created by orlandordiaz on 2/19/16.
 */
public class CheckingAccount extends Account {
    private double monthlyFee;


    /* Construct a CheckingAccount with a given balance and monthly fee. */
    public CheckingAccount(double balance, double monthlyFee) {
        super(balance);
        this.monthlyFee = monthlyFee;
    }
    public double subtractMonthlyFee()
    {
        double accountBalance = getBalance();
        accountBalance = accountBalance - monthlyFee;
        setBalance(accountBalance);

        return monthlyFee;
    }
}

