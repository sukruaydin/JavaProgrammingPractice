package day35_OOP_Encapsulation.WarmUp;

public class CybertekStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public String fieldOfStudy;

    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;

    public CybertekStudent(String name, char gender, int age, int batchNumber, int groupNumber,
                           String fieldOfStudy, String programmingLanguage) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
    }

    static {
        schoolName = "Cydeo School";
        programmingLanguage = "java";
        secretCode = "Wooden Spoon";
    }

    public static void printSchoolName(){
        System.out.println("schoolName = " + schoolName);
    }

    public static void printSecretCode(){
        System.out.println("secretCode = " + secretCode);
    }

    public void attendClass(){
        System.out.println(name + " attended the class");
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public String toString() {
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", secretCode='" + secretCode + '\'' +
                '}';
    }



}

/*
2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()

 */
