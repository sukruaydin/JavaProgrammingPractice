package day04_Variables;

public class Currencies {

    public static void main(String[] args) {

        //dollar to turkishLira, euro, ruble, jpy..

        double dollar = 50;

        double turkishLira = dollar * 14.99;    // nebati ve avaneleri sağolsun.
        double euro = dollar * 0.95;
        double ruble = dollar * 69.35;
        double jpy = dollar * 131.19;
        double pounds = dollar * 0.81;
        double dirham = dollar * 3.67;
        double cad = dollar * 1.29;
        double pkr = dollar * 187.76;

        System.out.println();
        System.out.println("dollar = " + dollar);
        System.out.println();
        System.out.println("turkishLira = " + turkishLira);
        System.out.println("euro = " + euro);
        System.out.println("ruble = " + ruble);
        System.out.println("jpy = " + jpy);
        System.out.println("pounds = " + pounds);
        System.out.println("dirham = " + dirham);
        System.out.println("cad = " + cad);
        System.out.println("pkr = " + pkr);


    }

}
