package day36_Inheritance.Tasks.EmployeeTask;

public class CompanyObjects {

    public static void main(String[] args) {

        Tester tester1 = new Tester();
        tester1.setInfo("Oğuz",'M',31,"QA Lead",3408,150_000,"Apple");
        tester1.work();
        tester1.test();

        Developer developer1 = new Developer();
        developer1.setInfo("Kavak",'M',30,"Developer Lead",3909,185_000,"Tesla");
        developer1.work();
        developer1.code();

        Driver driver1 = new Driver();
        driver1.setInfo("Şükrü",'M',29,"Driver Lead",3718,75_000,"Ülker");
        driver1.work();
        driver1.drive();

        Teacher teacher1 = new Teacher();
        teacher1.setInfo("Muhtar",'M', 33, "Java Teacher",3715,250_000,"Cydeo");
        teacher1.work();
        teacher1.teach();


    }


}
