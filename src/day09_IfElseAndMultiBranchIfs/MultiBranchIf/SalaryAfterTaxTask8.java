package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class SalaryAfterTaxTask8 {

    public static void main(String[] args) {
        //calculate the salaryAfterTax by given tax rates, besides if married he pays %5 less
        int salary = 70_000;
        double salaryAfterTax;
        boolean married = true;

        if (salary >= 130_000 && !married){
            salaryAfterTax = salary - (salary* 0.35);
        } else if (salary >= 130_000 && married) {
            salaryAfterTax = salary - (salary * 0.30);
        }else if (salary >= 100_000 && salary < 130_000 && !married) {
            salaryAfterTax = salary - (salary * 0.30);
        }else if (salary >= 100_000 && salary < 130_000 && married) {
            salaryAfterTax = salary - (salary * 0.25);
        }else if (salary >= 80_000 && salary < 100_000 && !married) {
            salaryAfterTax = salary - (salary * 0.25);
        }else if (salary >= 80_000 && salary < 100_000 && married) {
            salaryAfterTax = salary - (salary * 0.20);
        }else if (salary < 80_000 && !married) {
            salaryAfterTax = salary - (salary * 0.20);
        }else {
            salaryAfterTax = salary - (salary * 0.15);
        }
        System.out.println("salaryAfterTax = " + salaryAfterTax);


    }

}
