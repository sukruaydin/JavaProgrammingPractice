package day35_OOP_Encapsulation.Class;

public class Person {

    private String name;
    private int age;

    //getters
    public String getName(){  //this MUST be public
        return name;
    }
    public int getAge(){    //this MUST be public
        return age;
    }
    //setters
    public void setName(String name){  //this MUST be public
        this.name = name;
    }
    public void setAge(int age){  //this MUST be public
        if (age<=0 || age>120){
            System.err.println("Invalid Age : " + age);
            System.exit(0);
        }
        this.age = age;
    }

    //getters and setters can't be STATIC, cuz it includes instanceVariables

    /*
    What is the point of encapsulation?
    - It gives a strong control over variables
    - It makes your codes more secure
    - for exp. : By making public, we can't give any pre-conditions
     */



    /*public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }*/



}
