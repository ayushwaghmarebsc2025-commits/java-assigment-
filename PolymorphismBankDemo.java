// Task on Polymorphism - Method Overloading and Method Overriding
// Simple Banking System

class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // method overloading - same name, different parameters
    // version 1 - normal withdraw with only amount
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Withdrew: " + amount);
        }
    }

    // version 2 - overloaded withdraw with a remark/reason
    public void withdraw(double amount, String remark) {
        System.out.println("Transaction remark: " + remark);
        withdraw(amount); // reusing the first version
    }

    public void displayAccountInfo() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Balance        : " + balance);
    }
}

class SavingsAccount extends Account {
    private int withdrawalsThisMonth;
    private static final int MAX_WITHDRAWALS = 3; // limit per month

    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.withdrawalsThisMonth = 0;
    }

    // method overriding - savings account has withdrawal limit rule
    @Override
    public void withdraw(double amount) {
        if (withdrawalsThisMonth >= MAX_WITHDRAWALS) {
            System.out.println("Withdrawal denied. Monthly withdrawal limit reached for Savings Account.");
            return;
        }
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance in Savings Account.");
        } else {
            balance = balance - amount;
            withdrawalsThisMonth++;
            System.out.println("Savings Account withdrew: " + amount +
                    " (Withdrawal " + withdrawalsThisMonth + " of " + MAX_WITHDRAWALS + " this month)");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    // method overriding - current account allows overdraft, no monthly limit
    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdraw amount.");
        } else if ((balance - amount) < -overdraftLimit) {
            System.out.println("Withdrawal denied. Overdraft limit exceeded for Current Account.");
        } else {
            balance = balance - amount;
            System.out.println("Current Account withdrew: " + amount + " (unlimited withdrawals allowed)");
        }
    }
}

public class PolymorphismBankDemo {
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount("SB100", "Anita Desai", 5000.0);
        CurrentAccount current = new CurrentAccount("CA200", "Vikram Singh", 3000.0, 1000.0);

        System.out.println("----- Savings Account -----");
        savings.displayAccountInfo();
        savings.deposit(1000.0);
        savings.withdraw(500.0);          // overloaded version 1
        savings.withdraw(200.0, "ATM withdrawal"); // overloaded version 2
        savings.withdraw(300.0);
        savings.withdraw(100.0);          // this should hit the monthly limit
        savings.displayAccountInfo();

        System.out.println();
        System.out.println("----- Current Account -----");
        current.displayAccountInfo();
        current.deposit(500.0);
        current.withdraw(1000.0, "Cheque payment"); // overloaded version 2 (calls overridden withdraw)
        current.withdraw(2500.0); // should use overdraft
        current.withdraw(1000.0); // should be denied, overdraft exceeded
        current.displayAccountInfo();

        System.out.println();
        System.out.println("----- Demonstrating Polymorphism (base class reference) -----");
        Account[] accounts = { savings, current };
        for (Account acc : accounts) {
            acc.displayAccountInfo();
            acc.withdraw(50.0); // calls the overridden version based on actual object type
            System.out.println();
        }
    }
}
