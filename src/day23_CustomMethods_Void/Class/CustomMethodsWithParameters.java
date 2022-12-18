package day23_CustomMethods_Void.Class;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        odOrEven(5);
        ageOfPerson(1993);
        numbersBetween(3,12);

    }

    public static void odOrEven(int number){
        if (number%2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
    public static void ageOfPerson(int birthYear){

        System.out.println("the age is: " + (2022 - birthYear));

    }
    public static void numbersBetween(int beginning, int ending){
        for (int i = beginning; i <= ending; i++) {
            System.out.print(i+" ");
        }
    }
}
