package day38_Inheritance_MethodOverriding.Tasks.shapeTask;

public class Shape {
    
    public String name;


    public Shape(String name){
        this.name = name;
    }


    public double area(){
        return 0;
    }
    public double perimeter(){
        return 0;
    }
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }


}
