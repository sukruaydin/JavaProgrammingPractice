package day33_CustomClass_Statics.Tasks;

public class CydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Hatice",25,'F',11,'A',9,2);
        CydeoStudent student2 = new CydeoStudent("Oğuz",32,'M',12,'B',9,5);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);

        CydeoStudent.printProgLanguage();
        CydeoStudent.printSchoolName();

        CydeoStudent.programmingLanguage = "Python";
        CydeoStudent.printProgLanguage();

    }

}
