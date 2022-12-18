package day39_EncapsulationInheritance_Practice.Class.cydeoTask;

public class Person {

    private String name;
    private int age;
    private char gender;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age<=0 || age>=120){
            System.err.println("Invalid age:"+age);
            System.exit(1);
        }
        this.age = age;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        if ( !(gender == 'M' || gender == 'F')){
            System.err.println("Invalid gender:"+gender);
            System.exit(1);
        }
        this.gender = gender;
    }


    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }


    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }


}
