package day33_CustomClass_Statics.Class;

public class IphoneObjects {

    public static void main(String[] args) {


        //staticVariables are called through class name
        String OS = Iphone.operatingSystem;
        System.out.println("OS = " + OS);


        //staticMethods are called through class name
        //so, there is no need to create an object
        Iphone.printBrand();



    }

}
