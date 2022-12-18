package day31_CustomClass_Constructors.Class;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person("Şükrü",'M',29);
        Person person2 = new Person("Hale",'F',26);
        person2.age = 27;

        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);




    }

}
