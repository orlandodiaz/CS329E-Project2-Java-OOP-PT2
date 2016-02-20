package Chen.business;

/**
 * Created by CK on 2/19/16.
 */
public class Employee extends Person {
    private String SSN;
    public Employee(){
        super();
        SSN ="";
    }
    public void setSSN(String SSN){
        this.SSN = SSN;
    }

    public String getSSN() {
        return SSN;
    }

    @Override
    public String getDisplayText() {
        return super.toString()+ "\nSocial security number: " + SSN + "\n";
    }
}
