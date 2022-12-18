package day39_EncapsulationInheritance_Practice.Tasks.studentTask;

public class UndergraduateStudent extends Student{

    public UndergraduateStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade, String schoolName) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
    }


    @Override
    public void study() {
        System.out.println(getStudentID() + " " + getName() + " is studying on " +getFieldOfStudy());
    }

}
