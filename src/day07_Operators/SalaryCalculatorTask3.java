package day07_Operators;

public class SalaryCalculatorTask3 {

    public static void main(String[] args) {

        double hourlyRate = 50;
        int weeklyHours = 45;
        double stateTaxRate = 0.06;
        double federalTaxRate = 0.26;

        double salaryBeforeTax = hourlyRate * weeklyHours * 52; //yearly salary
        double stateTax = stateTaxRate * salaryBeforeTax;
        double federalTax = federalTaxRate * salaryBeforeTax;
        double salaryAfterTax = salaryBeforeTax - (stateTax + federalTax);

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("salaryBeforeTax = $" + salaryBeforeTax);
        System.out.println("stateTax = $" + stateTax);
        System.out.println("federalTax = $" + federalTax);
        System.out.println("salaryAfterTax = $" + salaryAfterTax);
        System.out.println("ALLAH BEREKET VERSİN" );

    }

}
