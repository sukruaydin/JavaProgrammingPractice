package day04_Variables;

public class Rectangle {

    public static void main(String[] args) {

        // calculate area & perimeter of a rectangle, length = 3.5 cm / width = 4.5 cm

        double length = 3.5;
        double width = 4.5;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("length = cm " + length);
        System.out.println("width = cm " + width);
        System.out.println("area = cm^2 " + area);
        System.out.println("perimeter = cm " + perimeter);



    }

}
