package day03_EscapeSequences;

public class EscapeSequences {

    public static void main(String[] args) {

        /*
        back-slash is reserved for escape-sequences
        escape sequences MUST  be given within the double quote (as a String)
        \n: starts a new line
        \t: tab (paragraph space)
        \\: single back slash
        \": double quote
         */

        System.out.println("Hello World \nHow are you all today \nIt is nice to see you all \nwhat class do we have next week?");
        System.out.println("-----------------------------------");
        System.out.println("\tjava is a cool programming language");
        System.out.println("-----------------------------------");
        System.out.println("/--\\");
        System.out.println("//--\\\\"); //needed 4 back-slashes to print 2 back-slashes
        System.out.println("-----------------------------------");
        System.out.println("My favorite TV show is \"IT Crowd\"");


    }

}
