package day14_String2.Class;

public class StringMethods2 {

    public static void main(String[] args) {

        //repeat() METHOD
        //it just works on jdk 11 or the versions coming after
        String s1 = "Ahmet";
        s1 = s1.repeat(5);
        System.out.println("s1 = " + s1);//use the soft-wrap button on the console to see output easier.

        System.out.println("ending to defence paper: " + "!".repeat(3));
        System.out.println("-----------------------------------------------------------");

        //isEmpty() METHOD
        //checks if the length is zero, return type ==> boolean
        String s2 = "    ";
        boolean r2 = s2.isEmpty();
        System.out.println("r2 = " + r2);
        System.out.println("-----------------------------------------------------------");


        //isBlank() METHOD
        //checks if the string is blank, whether including sth in it such as letter, numbers.
        // return type ==> boolean
        String s3 = "    ";
        boolean r3 = s2.isBlank();
        System.out.println("r3 = " + r3);
        System.out.println("-----------------------------------------------------------");

        //equals() METHOD
        //checks if 2 strings equals or not, return type ==> boolean
        //this method is case-sensitive
        String s4 = "java";
        String s5 = new String("Java");
        System.out.println("r4 = " + s4.equals(s5));//false

        System.out.println("-----------------------------------------------------------");

        //equalsIgnoreCase() METHOD
        //checks if 2 strings equals or not, without considering the letters are UPPERCASE or LOWERCASE
        // return type ==> boolean
        System.out.println("r5 = " + s4.equalsIgnoreCase(s5));//true
        System.out.println("-----------------------------------------------------------");

        //contains() METHOD
        //checks if the given string is contained in the another string.
        // return type ==> boolean
        String s6 = "I love Java programming language";
        boolean r6 = s6.contains("C#");
        boolean r7 = s6.contains("Java");
        System.out.println(r6 + " " + r7);
        //in order not to handle case sensitivity ==>
        boolean r = s6.toLowerCase().contains("java");
        System.out.println("r = " + r);

        System.out.println("-----------------------------------------------------------");

        //startsWith() METHOD
        //checks if the string starts with the given character(s)
        // return type ==> boolean
        String name = "Wooden Spoon";
        boolean r8 = name.startsWith("woo");//false
        System.out.println("r8 = " + r8);;
        System.out.println("-----------------------------------------------------------");

        //endsWith() METHOD
        //checks if the string ends with the given character(s)
        // return type ==> boolean
        boolean r9 = name.endsWith("oon");//true
        System.out.println("r9 = " + r9);;
        System.out.println("-----------------------------------------------------------");

    }
}
