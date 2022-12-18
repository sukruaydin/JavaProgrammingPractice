package day30_CustomClass.WarmUp;

public class MyAccount_CapitalOne {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Samet Fındık",123456789);
        account1.deposit(1000);
        account1.checkBalance();
        account1.withdraw(900);
        account1.checkBalance();
        System.out.println("-----------------------------");

        BankAccount account2 = new BankAccount();
        account2.setInfo("Şükrü Aydın", 987654321);
        account2.deposit(99_000);
        account2.checkBalance();


    }



}
