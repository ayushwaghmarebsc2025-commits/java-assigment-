// Homework on Abstraction
// This program shows abstraction using an abstract class BankAccount
// and two subclasses: SavingsAccount and CheckingAccount

abstract class BankAccount {
    // attributes are private to follow encapsulation
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // giving protected getters/setters so subclasses can use balance
    protected double getBalanceValue() {
        return balance;
    }

    protected void setBalanceValue(double balance) {
        this.balance = balance;
    }

    protected String getAccNo() {
        return accountNumber;
    }

    protected String getHolder() {
        return accountHolderName;
    }

    // abstract methods - no body here, subclasses must implement them
    public abstract String getAccountNumber();
    public abstract String getAccountHolderName();
    public abstract double getBalance();
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    private static final double MIN_BALANCE = 500.0; // minimum balance required

    public SavingsAccount(String accNo, String holder, double balance, double interestRate) {
        super(accNo, holder, balance);
        this.interestRate = interestRate;
    }

    @Override
    public String getAccountNumber() {
        return getAccNo();
    }

    @Override
    public String getAccountHolderName() {
        return getHolder();
    }

    @Override
    public double getBalance() {
        return getBalanceValue();
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalanceValue(getBalanceValue() + amount);
            System.out.println("Deposited " + amount + " into Savings Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        // savings account needs to keep a minimum balance
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (getBalanceValue() - amount < MIN_BALANCE) {
            System.out.println("Withdrawal denied. Minimum balance of " + MIN_BALANCE + " must be maintained.");
        } else {
            setBalanceValue(getBalanceValue() - amount);
            System.out.println("Withdrew " + amount + " from Savings Account.");
        }
    }

    public double getInterestRate() {
        return interestRate;
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accNo, String holder, double balance, double overdraftLimit) {
        super(accNo, holder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String getAccountNumber() {
        return getAccNo();
    }

    @Override
    public String getAccountHolderName() {
        return getHolder();
    }

    @Override
    public double getBalance() {
        return getBalanceValue();
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalanceValue(getBalanceValue() + amount);
            System.out.println("Deposited " + amount + " into Checking Account.");
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    @Override
    public void withdraw(double amount) {
        // checking account can go negative up to overdraft limit
        if (amount <= 0) {
            System.out.println("Withdraw amount must be positive.");
        } else if (getBalanceValue() - amount < -overdraftLimit) {
            System.out.println("Withdrawal denied. Overdraft limit of " + overdraftLimit + " exceeded.");
        } else {
            setBalanceValue(getBalanceValue() - amount);
            System.out.println("Withdrew " + amount + " from Checking Account.");
        }
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }
}

public class AbstractionBankDemo {
    public static void main(String[] args) {

        // creating a savings account
        SavingsAccount savings = new SavingsAccount("SB1001", "Rahul Sharma", 2000.0, 4.5);

        // creating a checking account
        CheckingAccount checking = new CheckingAccount("CH2001", "Priya Verma", 1000.0, 500.0);

        System.out.println("----- Savings Account -----");
        System.out.println("Account No: " + savings.getAccountNumber());
        System.out.println("Holder Name: " + savings.getAccountHolderName());
        System.out.println("Initial Balance: " + savings.getBalance());

        savings.deposit(500.0);
        System.out.println("Balance after deposit: " + savings.getBalance());

        savings.withdraw(1800.0); // this should fail because of minimum balance rule
        savings.withdraw(1000.0); // this should work
        System.out.println("Balance after withdrawal attempts: " + savings.getBalance());

        System.out.println();
        System.out.println("----- Checking Account -----");
        System.out.println("Account No: " + checking.getAccountNumber());
        System.out.println("Holder Name: " + checking.getAccountHolderName());
        System.out.println("Initial Balance: " + checking.getBalance());

        checking.deposit(200.0);
        System.out.println("Balance after deposit: " + checking.getBalance());

        checking.withdraw(1600.0); // uses overdraft, should still be allowed
        System.out.println("Balance after withdrawal (using overdraft): " + checking.getBalance());

        checking.withdraw(200.0); // this should fail, overdraft limit exceeded
    }
}
