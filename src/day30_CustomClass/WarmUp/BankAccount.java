package day30_CustomClass.WarmUp;

public class BankAccount {

    //1--> instanceVariables
    public String accountHolder;
    public long accountNumber;
    public double balance;


    //2--> instanceMethods
    //2.1--> setInfo method
    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    //2.2--> toString method
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    //2.3--> checkBalance method
    public void checkBalance(){
        System.out.println("Your available balance is: $" + balance);
    }

    //2.4--> deposit method
    public void deposit(double amount){
        if (amount <= 0){
            System.err.println("Depositing amount can NOT be zero or negative");
            return;
        }
        balance += amount;
    }

    //2.5--> withdraw method
    public void withdraw(double amount){
        if (amount > balance){
            System.err.println("Withdrawing amount can NOT be greater than " + balance);
            return;
        }
        if (amount <= 0){
            System.err.println("Withdrawing amount can NOT be zero or negative");
            return;
        }
        balance -= amount;
    }





}
