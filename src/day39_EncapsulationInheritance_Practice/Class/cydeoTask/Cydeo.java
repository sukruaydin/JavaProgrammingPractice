package day39_EncapsulationInheritance_Practice.Class.cydeoTask;

public class Cydeo {

    public static void main(String[] args) {

        Tester tester = new Tester("şükrü",29,'M',11,"SDET",115_000);
        System.out.println(tester);
        tester.work();

        System.out.println("---------------------------------------------------------");

        Developer developer = new Developer("oğuz",32,'M',21,"Developer",165_000);
        System.out.println(developer);
        developer.work();
        developer.setAge(39);
        System.out.println(developer);

        System.out.println("---------------------------------------------------------");

        Teacher teacher = new Teacher("muhtar",35,'M',31,"Java Teacher",250_000);
        System.out.println(teacher);
        teacher.work();
        teacher.drink();

        System.out.println("---------------------------------------------------------");

        Student student = new Student("hatice",26,'F',41,"Java");
        System.out.println(student);
        student.study();
        student.eat();

    }

}
