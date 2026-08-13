abstract class BankAccountt {
    String accountNumber;
    double balance;

    BankAccountt(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    abstract double calculateInterest();
}

class SavingsAccount extends BankAccountt {

    SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.05;
    }
}

class CurrentAccount extends BankAccountt {

    CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    double calculateInterest() {
        return balance * 0.02;
    }
}

public class BankAccount {
    public static void main(String[] args) {

        BankAccountt savings =
                new SavingsAccount("SA101", 10000);

        BankAccountt current =
                new CurrentAccount("CA101", 10000);

        System.out.println("Savings Interest: "
                + savings.calculateInterest());

        System.out.println("Current Interest: "
                + current.calculateInterest());
    }
}