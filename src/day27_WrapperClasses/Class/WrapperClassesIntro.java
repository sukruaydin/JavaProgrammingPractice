package day27_WrapperClasses.Class;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;     //collection and map dataStructures don't support primitive dataTypes
                            //so we need to convert them into objects by using wrapper classes

        Integer newNum1 = num1; //AUTOBOXING, converting from primitive to object
        //Double d = num1;      //we can't assign num1 to double or long
        //Long l = num1;        //each class can covert its own dataTypes




         int num2 = newNum1; //UNBOXING, converting from object to primitive
                             //when unboxing we can assign other dataTypes as long as within the range

        Integer integerValue = 100;
        int i1 = integerValue;
        double d1 = integerValue;
        long l1 = integerValue;



    }

}
