package Orlando.business;
import java.text.NumberFormat;
/**
 * Created by orlandordiaz on 2/19/16.
 */
public class CheckingAccount extends Account {
    private double monthlyFee;
    private double amount;
    /* Construct a CheckingAccount with a given balance and monthly fee. */
    public CheckingAccount() {
        super();

    }
    public void subtractMonthlyFee()
    {
        amount = super.getBalance() - monthlyFee;

    }
    public void setMonthlyFee(double monthlyFee){
        this.monthlyFee = monthlyFee;

    }
    public double getMonthlyFee(){
        return monthlyFee;
    }
    public String getMonthlyFeeFormatted(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String priceFormatted = currency.format(monthlyFee);
        return priceFormatted;
    }

}

