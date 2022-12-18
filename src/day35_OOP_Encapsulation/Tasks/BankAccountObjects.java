package day35_OOP_Encapsulation.Tasks;

public class BankAccountObjects {

    public static void main(String[] args) {

        BankAccount bankAccount1 = new BankAccount("şükrü",12345,50_000);
        System.out.println("bankAccount1 = " + bankAccount1);
        bankAccount1.deposit(5_000);
        System.out.println("bankAccount1 = " + bankAccount1);

        System.out.println("---------------------------------");

        bankAccount1.withdraw(10_000);
        System.out.println("bankAccount1 = " + bankAccount1);

        System.out.println("---------------------------------");


        bankAccount1.deposit(1_000);
        System.out.println(bankAccount1.checkBalance());





    }

}
