
public class FixedDepositAccount extends BankAccount {

    private double interest;
    private double months;

    
    public FixedDepositAccount(String name, double balance) {
        super(name, balance);
    }
    
    public FixedDepositAccount(String name, double balance, double interest) {
        super(name, balance);
        this.interest = interest;
    }
    
    public FixedDepositAccount(String name, double balance, double interest, double months) {
        super(name, balance);
        this.interest = interest;
        this.months = months;
    }
    
    public double getInterest() {
        return interest;
    }

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public double getMonths() {
        return months;
    }

    public void setMonths(int months) {
        this.months = months;
    }
    @Override
    public void deposit(double amount) {
        System.err.println("Operations not allowed");
    }

    @Override
    public void withdraw(double amount) {
        System.err.println("Operations not allowed");
    }

    public void showBalance() {
        System.out.println("Account number: " + getAccNumber());
        System.out.println("Account name: " + getName());
        System.out.println("Account balance with interest: " + this.getBalance() * (100 + this.interest) / 100);
    }

}
