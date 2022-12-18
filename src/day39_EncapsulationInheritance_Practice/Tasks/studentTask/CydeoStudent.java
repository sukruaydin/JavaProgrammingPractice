package day39_EncapsulationInheritance_Practice.Tasks.studentTask;

public class CydeoStudent extends Student{

    private int batchNumber, groupNumber;
    private String programmingLanguage;


    public int getBatchNumber() {
        return batchNumber;
    }
    public void setBatchNumber(int batchNumber) {
        if (batchNumber<=0){
            System.err.println("Invalid batch number:"+batchNumber);
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }
    public int getGroupNumber() {
        return groupNumber;
    }
    public void setGroupNumber(int groupNumber) {
        if (groupNumber<=0){
            System.err.println("Invalid group number:"+batchNumber);
            System.exit(1);
        }
        this.groupNumber = groupNumber;
    }
    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null){
            System.err.println("Programming language can NOT be null");
            System.exit(1);
        }
        if (programmingLanguage.isEmpty()){
            System.err.println("Invalid programming language");
            System.exit(1);
        }
        this.programmingLanguage = programmingLanguage;
    }


    public CydeoStudent(String name, int age, char gender, int studentID, String fieldOfStudy, char grade,
                        String schoolName, int batchNumber, int groupNumber, String programmingLanguage) {
        super(name, age, gender, studentID, fieldOfStudy, grade, schoolName);
        setBatchNumber(batchNumber);
        setGroupNumber(groupNumber);
        setProgrammingLanguage(programmingLanguage);
    }


    @Override
    public void eat() {
        System.out.println(getName() + " is eating with " + programmingLanguage);
    }
    @Override
    public void drink() {
        System.out.println(getName() + " is drinking with " + programmingLanguage);
    }
    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping with " + programmingLanguage);
    }
    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", studentID=" + getStudentID() +
                ", fieldOfStudy='" + getFieldOfStudy() + '\'' +
                ", grade=" + getGrade() +
                ", schoolName='" + getSchoolName() + '\'' +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }


}
