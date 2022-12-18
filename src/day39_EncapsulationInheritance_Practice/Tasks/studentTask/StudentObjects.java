package day39_EncapsulationInheritance_Practice.Tasks.studentTask;

public class StudentObjects {

    public static void main(String[] args) {

        CydeoStudent cydeoStudent = new CydeoStudent("şükrü",29,'M',11,"SDET",
                'A',"Cydeo School",9,5,"Java");

        System.out.println(cydeoStudent);
        cydeoStudent.drink();



    }

}
