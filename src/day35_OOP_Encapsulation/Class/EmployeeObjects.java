package day35_OOP_Encapsulation.Class;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("",'Q',299,-150_000);

        System.out.println("employee1 = " + employee1);

        employee1.setAge(29);

        System.out.println("employee1 = " + employee1);

        System.out.println("-----------------------------------------------");


        Employee employee2 = new Employee("şükrü", 'M',29,115_000);

        employee2.setSalary(employee2.getSalary() + 5_000);

        System.out.println("employee2 = " + employee2);

    }

}
