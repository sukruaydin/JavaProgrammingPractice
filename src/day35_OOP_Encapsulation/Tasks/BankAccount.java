package day35_OOP_Encapsulation.Tasks;

public class BankAccount {


    private String accountHolder;
    private long accountNumber;
    private double balance;


    public String getAccountHolder() {
        return accountHolder;
    }
    public long getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        if (balance<0){
            System.err.println("Balance can NOT be less than 0:"+balance);
            System.exit(0);
        }
        this.balance = balance;
    }


    public BankAccount(String accountHolder, long accountNumber, double balance) {
        setAccountHolder(accountHolder);
        setAccountNumber(accountNumber);
        setBalance(balance);
    }


    public double deposit(double amount){
        if (amount<=0){
            System.err.println("Depositing money can NOT be 0 or less:"+amount);
            System.exit(0);
        }
        balance += amount;
        return balance;
    }
    public double withdraw(double amount){
        if (amount<=0){
            System.err.println("Withdrawing money can NOT be 0 or less:"+amount);
            System.exit(0);
        }
        if (amount>balance){
            System.err.println("Withdrawing money can NOT be greater than balance:"+amount);
            System.exit(0);
        }
        balance -= amount;
        return balance;
    }
    public double checkBalance(){
        return balance;
    }
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }



}
/*
3. create a class named BankAccount
        Private variables:
            accountHolder, accountNumber, balance

        encapsulate all the fields

        Add a constructor that allows user to set all the fields when the object is created.
                        (If the arguments not valid it should not be set to the instances)

        Extra methods:
                deposit()
                withdraw()
                checkbalance()
                toString()

            DO NOT duplicate any code fragments
 */
