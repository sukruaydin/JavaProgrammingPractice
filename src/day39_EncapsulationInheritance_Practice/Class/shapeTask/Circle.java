package day39_EncapsulationInheritance_Practice.Class.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;


    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        if (radius<=0){
            System.err.println("Invalid radius");
            System.exit(1);
        }
        this.radius = radius;
    }


    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }


    @Override
    public double area() {
        return pi * radius * radius;
    }
    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }


}
