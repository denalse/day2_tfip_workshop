
public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to SDF Day02 Workshop Test\n");


        BankAccount ba1 = new BankAccount("Apple",0);
        ba1.deposit(100);
        //ba1.getTransactions().toString();
        System.out.println(ba1.toString());

        BankAccount ba2 = new BankAccount("Ben",200);
        ba2.withdraw(100.50);
        System.out.println(); //add line
        System.out.println(ba2.toString());


        FixedDepositAccount fd1 = new FixedDepositAccount("Cary", 100);
        fd1.getTransactions();
        System.out.println(); //add line
        System.out.println(fd1.toString());

    }
}