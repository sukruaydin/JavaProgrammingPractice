package day39_EncapsulationInheritance_Practice.Class.cydeoTask;

public class Student extends Person{

    private int studentID;
    private String fieldOfStudy;


    public int getStudentID() {
        return studentID;
    }
    public void setStudentID(int studentID) {
        if (studentID<=0){
            System.err.println("Invalid student ID:"+studentID);
            System.exit(1);
        }
        this.studentID = studentID;
    }
    public String getFieldOfStudy() {
        return fieldOfStudy;
    }
    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }


    public Student(String name, int age, char gender, int studentID, String fieldOfStudy) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
    }


    public void study(){
        System.out.println(fieldOfStudy+ " student " + getName() + " is studying");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                '}';
    }


}
