package day05_StringConcatenations;

public class Birthday {

    public static void main(String[] args) {

        String name = "Şükrü",
                birthMonth = "January";
        int birthDay = 1,
                birthYear = 1993;

        char slash = '/';

        System.out.println(name + " was born on " + birthMonth + slash + birthDay + slash + birthYear + ".");

        System.out.println("-------------------------------------------------------");

        String bookName = "Erguvanlar Açarken";
        System.out.println("My favorite book is \"" + bookName + "\".");
    }

}
