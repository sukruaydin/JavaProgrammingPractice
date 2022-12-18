package day35_OOP_Encapsulation.Tasks.RestaurantTask;

public class Server {

    private String name;
    private int employeeID;
    private double hourlyRate;
    private boolean fullTime;


    public String getName() {
        return name;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    public double getHourlyRate() {
        return hourlyRate;
    }
    public boolean isFullTime() {
        return fullTime;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmployeeID(int employeeID) {
        if (employeeID<=0){
            System.err.println("Employee ID can NOT be xero or negative :"+employeeID);
            System.exit(0);
        }
        this.employeeID = employeeID;
    }
    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate<=0){
            System.err.println("HourlyRate can NOT be zero or negative");
            System.exit(0);
        }
        this.hourlyRate = hourlyRate;
    }
    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public Server(String name, int employeeID, double hourlyRate, boolean fullTime) {
        setName(name);
        setEmployeeID(employeeID);
        setHourlyRate(hourlyRate);
        setFullTime(fullTime);
    }

    public String toString() {
        String result = "Server{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + "part time" +
                '}';

        if (fullTime){
            result = "Server{" +
                    "name='" + name + '\'' +
                    ", employeeID=" + employeeID +
                    ", hourlyRate=" + hourlyRate +
                    ", fullTime=" + "full time" +
                    '}';
        }

        return result;
    }

}

/*
5. Restaurant Task:
    re-do the Restaurant task by making all the fields private in each custom classes

    Encapsulate all the field
        (salary cannot be set to negative)
        (employeeId cannot be set to negative or zero)

    Avoid any duplicated code fragments in each class
 */
