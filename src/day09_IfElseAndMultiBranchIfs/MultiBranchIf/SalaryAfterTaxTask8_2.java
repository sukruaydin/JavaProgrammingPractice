package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class SalaryAfterTaxTask8_2 {

    public static void main(String[] args) {

        int salary = 80_000;
        double taxRate;
        boolean ifMarried = true;

        if (salary >= 130_000){
            taxRate = 0.35;
        } else if (salary >= 100_000) {
            taxRate = 0.30;
        } else if (salary >= 80_000) {
            taxRate = 0.25;
        }else {
            taxRate = 0.20;
        }

        if (ifMarried){
            taxRate -= 0.05;
        }
        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println("salaryAfterTax = " + salaryAfterTax);

    }

}
