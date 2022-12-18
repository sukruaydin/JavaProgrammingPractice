package day33_CustomClass_Statics.Class;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        System.out.println("employee1 = " + employee1);

        Employee employee2 = new Employee();
        System.out.println("employee2 = " + employee2);

        System.out.println(employee1.isHuman);
        System.out.println(employee2.isHuman);


    }


}
