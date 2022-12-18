package day38_Inheritance_MethodOverriding.Tasks.shapeTask;

public class Rectangle extends Shape{

    public double length;
    public double width;


    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }


    @Override
    public double area() {
        return length * width;
    }
    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", width=" + width +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


}
