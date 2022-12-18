package day31_CustomClass_Constructors.Class;

public class Rectangle {

    //1--> instanceVariables
    public double length;
    public double width;

    //2--> constructor with initializing instanceVariables
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //3--> instanceMethods
    //3.1--> calculateArea method
    public double calculateArea(){
        return length * width;
    }

    //3.2--> calculatePerimeter method
    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    //3.3--> toString method
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + calculateArea() +
                ", perimeter=" + calculatePerimeter() +
                '}';
    }


}
