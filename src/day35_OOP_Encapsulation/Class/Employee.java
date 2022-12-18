package day35_OOP_Encapsulation.Class;

public class Employee {

    //1-->variables (instanceVariables, staticVariables)
    private String name;
    private char gender;
    private int age;
    private double salary;

    //2-->getters, setters
    //getters
    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    //setters
    public void setName(String name){
        if (name.isEmpty()){
            return;
        }
        this.name = name;
    }
    public void setGender(char gender){
        if (!(gender=='M' || gender=='F' || gender=='m' || gender=='f')){
            return;
        }
        this.gender = gender;
    }
    public void setAge(int age){
        if (age<16 || age>90){
            return;
        }
        this.age = age;
    }
    public void setSalary(double salary){
        if (salary<=0){
            return;
        }
        this.salary = salary;
    }


    //3-->constructor, static block
    //3.1-->constructor
    //we want those variables to be set as soon as the object is created
    //so, we created constructor
    //BUT, we need to insert setters methods inside in order to have those pre-conditions
    public Employee(String name, char gender, int age, double salary) {
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }




    //4-->methods (instanceMethods, staticMethods)
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }


}

/*
1. Create an Employee Class:
			private variables:
				name, gender, age, salary

			Encapsulate all the private fields

				1. Name can not be empty
				2. gender can not anything other than female or male
				3. age can not be less than 16, and greater than 90
				4. salary can not be zero or negative
 */
