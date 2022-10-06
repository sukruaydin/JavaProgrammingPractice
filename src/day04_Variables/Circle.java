package day04_Variables;

public class Circle {

    public static void main(String[] args) {

        //calculate area & perimeter of a circle

        double PI = 3.14;
        double radius = 10; //you can give int value in double, but it is taken as 10.0
        double diameter = 2 * radius;

        double area = PI * radius * radius;
        double perimeter = 2 * PI * radius;

        System.out.println();
        System.out.println("radius = cm " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("PI = " + PI);
        System.out.println();
        System.out.println("area = cm^2 " + area);
        System.out.println("perimeter = " + perimeter);

    }

}
