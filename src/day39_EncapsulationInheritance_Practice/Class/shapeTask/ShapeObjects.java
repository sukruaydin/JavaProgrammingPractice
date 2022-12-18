package day39_EncapsulationInheritance_Practice.Class.shapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println(square);
        square.setSide(6);
        System.out.println(square);

        System.out.println("---------------------------------------");

        Rectangle rectangle = new Rectangle(5,6);
        System.out.println(rectangle);
        System.out.println(rectangle.getName());
        rectangle.setLength(7);
        System.out.println(rectangle);

        System.out.println("---------------------------------------");

        Circle circle = new Circle(5);
        System.out.println(circle);



    }

}
