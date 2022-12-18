package day30_CustomClass.Class;


import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects_CapitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.setInfo("Oğuz",32,'M',"Project Manager",250_000,true);

        Employee employee2 = new Employee();
        employee2.setInfo("Şükrü",29,'M',"QA",85_000,false);

        Employee employee3 = new Employee();
        employee3.setInfo("Hatice",26,'F',"QA Lead",120_000,true);

        Employee employee4 = new Employee();
        employee4.setInfo("Kavak",30,'M',"Developer",99_000,false);

        Employee employee5 = new Employee();
        employee5.setInfo("Pişgin", 31, 'M', "DevTeam Lead",180_000,true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};

        //1--> find the full timers
        ArrayList<Employee> fullTimers = new ArrayList<>(Arrays.asList(employees));
        fullTimers.removeIf( p -> !p.isFullTime);
        System.out.println("fullTimers = " + fullTimers);
        System.out.println("full timer numbers: " + fullTimers.size());


        //2--> find max salary, 3--> find min salary
        int max = employees[0].salary;
        int min = employees[0].salary;
        for (Employee each : employees) {

            if (each.salary > max){
                max = each.salary;
            }

            if (each.salary < min){
                min = each.salary;
            }

        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }


}
