package day39_EncapsulationInheritance_Practice.Tasks.studentTask;


public class Person {

    private String name;
    private int age;
    private char gender;


    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null){
            System.err.println("Name can NOT be null");
            System.exit(1);
        }
        if (name.isEmpty()){
            System.err.println("Name can NOT be empty");
            System.exit(1);
        }

        int count = 0;
        char[] arr = name.toCharArray();
        for (char s : arr) {
            if ( ! Character.isLetterOrDigit(s) && s != ' '){
                count++;
            }
        }
        if (count>0){
            System.err.println("Invalid name:"+name);
            System.exit(1);
        }

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
        if (!(gender == 'M' || gender == 'F')){
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
        System.out.println(name + " is drink");
    }
    public void sleep(){
        System.out.println(name + " is sleep");
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
