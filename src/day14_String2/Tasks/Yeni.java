package day14_String2.Tasks;

public class Yeni {

    public static void main(String[] args) {
        for ( int i = 0; i++ < 5; System.out.print(i + " ,")) {
        }
        System.out.println();

        System.out.println("=========================");


        String commas2 = "";

        for ( int i = 0; i++ < 5; System.out.print(i)) {
            System.out.print(commas2);
            commas2 = ",";

        }
    }

}
