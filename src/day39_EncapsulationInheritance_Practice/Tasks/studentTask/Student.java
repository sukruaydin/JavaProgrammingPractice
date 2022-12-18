package day39_EncapsulationInheritance_Practice.Tasks.studentTask;

public class Student extends Person{

    private int studentID;
    private String fieldOfStudy;
    private char grade;
    private String schoolName;


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
        if (fieldOfStudy == null){
            System.err.println("Field of Study can NOT ne null");
            System.exit(1);
        }
        if (fieldOfStudy.isEmpty()){
            System.err.println("Field of Study can NOT be empty");
            System.exit(1);
        }
        this.fieldOfStudy = fieldOfStudy;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        if ( ! (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F' )){
            System.err.println("Invalid grade:"+grade);
            System.exit(1);
        }
        this.grade = grade;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public void setSchoolName(String schoolName) {
        if (schoolName == null){
            System.err.println("School Name can NOT ne null");
            System.exit(1);
        }
        if (schoolName.isEmpty()){
            System.err.println("School Name can NOT be empty");
            System.exit(1);
        }
        this.schoolName = schoolName;
    }


    public Student(String name, int age, char gender, int studentID, String fieldOfStudy,
                    char grade, String schoolName) {
        super(name, age, gender);
        setStudentID(studentID);
        setFieldOfStudy(fieldOfStudy);
        setGrade(grade);
        setSchoolName(schoolName);
    }


    public void study(){
        System.out.println(studentID + " " + getName() + " is studying");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + studentID +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }


}
