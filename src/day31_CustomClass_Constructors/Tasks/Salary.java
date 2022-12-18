package day31_CustomClass_Constructors.Tasks;

public class Salary {

    public double hourlyRate, stateTaxRate, federalTaxRate;
    public int weeklyHours;

    public Salary(double hourlyRate, double stateTaxRate, double federalTaxRate, int weeklyHours) {
        this.hourlyRate = hourlyRate;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
        this.weeklyHours = weeklyHours;
    }

    public double salary(){
        return hourlyRate * weeklyHours * 52;
    }

    public double stateTax(){
        return stateTaxRate * salary();
    }

    public double federalTax(){
        return federalTaxRate * salary();
    }

    public double salaryAfterTax(){
        return salary() - (stateTax() + federalTax());
    }

    public String toString() {
        return "Salary{" +
                ", salary=" + salary() +
                ", state tax=" + stateTax() +
                ", federal tax=" + federalTax() +
                ", salary after tax=" + salaryAfterTax() +
                '}';
    }
}

/*
1. SalaryCalculator Task:
		1.1 Create a class named Salary calculator:
		        Attributes:
		            hourlyRate, stateTaxRate, federalTaxRate, weeklyHours

	            Add a constructor to set all the fields

		        Actions:
		            salary(): calculates the salary ( hourlyRate * weeklyHour * 52)
		            stateTax(): calculates the totalStateTax
		            federalTax(): calculates the total federal tax
		            salaryAfterTax(): calculates the salary after tax
		            toString(): displays the salary, stateTax, federalTax, salaryAfterTax of the Object

 */
