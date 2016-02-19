package Chen.business;

/**
 * Created by CK on 2/19/16.
 */
public class Customer extends Person {
    private String CustomerNum;
    public Customer(){
        super();
        CustomerNum = "";
    }
    public void setCustomerNum(String CustomerNum){
        this.CustomerNum = CustomerNum;
    }
    public String getCustomerNum(){
        return CustomerNum;

    }

    @Override
    public String getDisplayText() {
        return super.toString()+ "\nCustomer number: " + CustomerNum + "\n";
    }
}
