package day35_OOP_Encapsulation.Class;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println("circle1 = " + circle1);

        circle1.setRadius(4);
        System.out.println(circle1.getRadius());



    }

}
