package day35_OOP_Encapsulation.Class;

public class Circle {

    //1-->variables
    public static double PI;
    private double radius;

    //2-->getters, setters
    //2.1-->getters
    public double getRadius(){
        return radius;
    }
    //2.2-->setters
    public void setRadius(double radius){
        if (radius<=0){
            return;
        }
        this.radius = radius;
    }

    //3-->constructor, static block
    //3.1-->constructor
    public Circle(double radius) {
        setRadius(radius);
    }
    //3.2-->static block
    static {
        PI = 3.14;
    }

    //4-->methods
    //4.1-->calcArea method
    public double calcArea(){
        return PI * radius * radius;
    }
    //4.2-->calcPerimeter method
    public double calcPerimeter(){
        return 2 * PI * radius;
    }
    //4.3-->toString method
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + PI +
                ", area=" + calcArea() +
                ", perimeter=" + calcPerimeter() +
                '}';
    }


}
/*
2. Create a class named Circle

			private variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:

 				toString()
 */
