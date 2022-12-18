package day30_CustomClass.WarmUp;

public class Offer {

    //1--> instanceVariables
    public String location;
    public String companyName;
    public String jobTitle;
    public int salary;
    public boolean hasBenefit;
    public boolean hasPTO;
    public boolean isWFH;
    public boolean fullTime;

    //2--> instanceMethods
    //2.1--> setInfo method
    public void setInfo(String location, String companyName, String jobTitle, int salary, boolean hasBenefit,
                 boolean hasPTO, boolean isWFH, boolean fullTime) {
        this.location = location;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefit = hasBenefit;
        this.hasPTO = hasPTO;
        this.isWFH = isWFH;
        this.fullTime = fullTime;
    }


    //2.2--> toString method
    public String toString() {
        return "Offer{" +
                "location='" + location + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", hasBenefit=" + hasBenefit +
                ", hasPTO=" + hasPTO +
                ", isWFH=" + isWFH +
                ", fullTime=" + fullTime +
                '}';
    }


    //2.3--> other methods



}
