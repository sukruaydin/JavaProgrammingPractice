package day33_CustomClass_Statics.Tasks;

public class CydeoStudent {

    //1--> instanceVariables and staticVariables
    public String name;
    public int age;
    public char gender;
    public int ID;
    public char grade;
    public int batchNumber;
    public int groupNumber;
    public  static String schoolName = "Cydeo";
    public  static String programmingLanguage = "Java";

    //2--> constructor
    public CydeoStudent(String name, int age, char gender, int ID, char grade, int batchNumber, int groupNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID = ID;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    //3--> instanceMethods and staticMethods
    //3.1--> study method
    public void study(){
        System.out.println(name + " is studying");
    }

    //3.2--> attendClass method
    public void attendClass(){
        System.out.println(name + " attended class");
    }

    //3.3--> printSchoolName method (better to be called through className)
    public static void printSchoolName(){
        System.out.println(schoolName);
    }

    //3.4--> printProgLanguage method (better to be called through className)
    public static void printProgLanguage(){
        System.out.println(programmingLanguage);
    }

    //3.5--> toString method
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", ID=" + ID +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", schoolName=" + schoolName +
                ", programmingLanguage=" + programmingLanguage +
                '}';


    }

}

/*

				Attributes:
					instances: name, age, gender, id, grade, batchNumber, groupNumber
					statics: schoolName, programmingLanguage

				Add a constructor that can set All the fields (instances)

				Actions:
					study()
					attendClass()
					printSchoolName(): displays the school name
					printProgLanguage(): displays the name of programming language
					toString()
 */
