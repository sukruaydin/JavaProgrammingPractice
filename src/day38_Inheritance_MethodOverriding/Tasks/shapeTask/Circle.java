package day38_Inheritance_MethodOverriding.Tasks.shapeTask;

public class Circle extends Shape{

    public double radius;
    public double pi = 3.14;


    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }


    @Override
    public double area(){
        return pi * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


}
