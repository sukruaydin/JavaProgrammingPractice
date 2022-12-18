package day35_OOP_Encapsulation.Tasks.ScrumTask;

public class Developer {

    private String name;
    private int employeeID;
    private String jobTitle;
    private double salary;


    public String getName() {
        return name;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            System.err.println("Employee ID can NOT be zero or negative");
            System.exit(0);
        }
        this.employeeID = employeeID;
    }
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSalary(double salary) {
        if (salary<0){
            System.err.println("Salary can NOT be negative");
            System.exit(0);
        }
        this.salary = salary;
    }


    public Developer(String name, int employeeID, String jobTitle, double salary) {
        setName(name);
        setEmployeeID(employeeID);
        setJobTitle(jobTitle);
        setSalary(salary);
    }


    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }


}
