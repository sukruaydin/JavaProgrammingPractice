package day13_String_1.Class;

public class StringMethods {

    public static void main(String[] args) {

        //char.At() METHOD
        //find 3rd character
        String word = "Cydeo";
        String thirdChar = word.charAt(2)+"";
        System.out.println(thirdChar);
        //find 10th character
        //char tenthChar = word.charAt(9); //it gives us "StringIndexOutOfBoundsException" error
        //System.out.println(tenthChar);
        System.out.println("-------------------------------------------------------");

        //length() METHOD
        //finds how many characters it has
        String s1 = "Batch EU9 is the best";
        int length = s1.length();
        System.out.println(length);
        //find the last character of the given  string above
        char lastChar = s1.charAt(length-1); //OR char lastChar = s1.charAt(s1.length()-1);
        System.out.println(lastChar);
        System.out.println("-------------------------------------------------------");

        //toLowerCase() and toUpperCase() METHODS
        String s2= "Şükrü Aydın";
        String lowerCase = s2.toLowerCase();
        String upperCase = s2.toUpperCase();
        System.out.println(lowerCase);
        System.out.println(upperCase);
        System.out.println(s2);//still gives me Şükrü Aydın as an output, cuz it is immutable
        //again an example
        String sentence = "Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase();
        System.out.println(sentence);

    }
}
