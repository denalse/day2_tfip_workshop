
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BankAccount {

    private final String name; // final
    private final String accNumber; // final
    private double balance;
    private Boolean accClosed = false;
    private Date accCreateDate;
    private Date accCloseDate;

    private List<String> transactions;

    public BankAccount(String name) {
        this.accNumber = generateAccNumber();
        this.name = name;
        this.balance = 0.0;

        if (transactions == null) {
            transactions = new ArrayList<>();
        }
    }

    public BankAccount(String name, double balance) {
        this.accNumber = generateAccNumber();
        this.name = name;
        this.balance = balance;

        if (transactions == null) {
            transactions = new ArrayList<>();
        }
    }

    public String getName() {
        return name;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<String> transactions) {
        this.transactions = transactions;
    }

    public Boolean getAccClosed() {
        return accClosed;
    }

    public void setAccClosed(Boolean accClosed) {
        this.accClosed = accClosed;
    }

    public Date getAccCreateDate() {
        return accCreateDate;
    }

    public void setAccCreateDate(Date accCreateDate) {
        this.accCreateDate = accCreateDate;
    }

    public Date getAccCloseDate() {
        return accCloseDate;
    }

    public void setAccCloseDate(Date accCloseDate) {
        this.accCloseDate = accCloseDate;
    }

    private String generateAccNumber() {
        int start = 66; // using ascii code A - Z
        int end = 90;
        int length = 10;

        Random random = new Random();
        String accountNo = "";

        for (int i = 0; i < length; i++) {
            int randomVal = start + (int) (random.nextFloat() * (end - start + 1));
            accountNo = accountNo + (char) randomVal;
        }

        return accountNo;

    }

    LocalDate date = LocalDate.now(); // date

    public void deposit(double amount) {

        if (!accClosed) {
            if (amount > 0.0) {
                this.balance = this.balance + amount;
                // System.out.println("Your current balance is " + this.balance + "at " + date);
                String log = "You deposit $" + amount + " at " + date.toString();
                transactions.add(log);
            } else {
                throw new IllegalArgumentException("You cannot make negative amounts");
            }

        } else {
            throw new IllegalArgumentException("Cannot deposit to an inactive account");
        }
    }

    public void withdraw(double amount) {
        if (!accClosed) {
            if (balance > amount) {
                this.balance = this.balance - amount;
                // System.out.println("Your current balance is " + this.balance + "at " + date);
                String log = "You withdraw $" + amount + "at" + date.toString();
                transactions.add(log);

            } else {
                throw new IllegalArgumentException("You cannot withdraw more than what you have!");
            }

        } else {
            throw new IllegalArgumentException("Cannot withdraw from an inactive account");
        }
    }

    @Override
    public String toString() {
        return "BankAccount [name=" + name + ", accNumber=" + accNumber + ", balance=" + balance + ", transactions="
                + transactions + ", accClosed=" + accClosed + ", accCreateDate=" + accCreateDate + ", accCloseDate="
                + accCloseDate + "]";
    }

}
