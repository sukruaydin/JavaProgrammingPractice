package day31_CustomClass_Constructors.Class;

public class Pizza {

    //1--> instanceVariables
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    //2--> constructor with initializing the instanceVariables
    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    //3--> instanceMethods
    //3.1--> calcCost method
    public double calcCost(){
        double cost = 0;
        if (size == 'S'){
            cost = (10 + (numberOfCheeseTopping+numberOfPepperoniTopping)*2);
        } else if (size == 'M') {
            cost = (12 + (numberOfCheeseTopping+numberOfPepperoniTopping)*2);
        } else if (size == 'L') {
            cost = (14 + (numberOfCheeseTopping+numberOfPepperoniTopping)*2);
        }
        return cost;
    }

    //3.2--> toString method
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", totalPrice= $" + calcCost() +
                '}';
    }
}
