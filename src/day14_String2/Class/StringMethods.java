package day14_String2.Class;

public class StringMethods {

    public static void main(String[] args) {

        //trim() METHOD
        //deletes white spaces
        String s1 = "   Şükrü    Aydın   ";
        s1 = s1.trim(); //deletes the white spaces before and after data
        System.out.println(s1);
        System.out.println("-------------------------------------------");

        //indexOf() and lastIndexOf() METHODS
        //indexOf() => starting from left side, finding the index number
        String s2 = "Java School";
        int n1 = s2.indexOf("h");
        System.out.println(n1);

        int n2 = s2.indexOf("o"); //find the index number of "o" coming after "h"
        System.out.println(n2); //returns me 4 => cuz first "o" is the 5th character

        int n3 = s2.indexOf("oo"); //to find it, we need to define it unique
        System.out.println(n3); //returns the first "o"s index number

        String s3 = "Java Programming Language";
        int n4 = s3.indexOf("am");
        System.out.println(n4);

        //lastIndexOf() => starting from right side, finding the index number
        int n5 = s3.lastIndexOf("g");
        System.out.println(n5);

        String s4 = "Java Nova Cava Wawa orange";
        int firstA = s4.indexOf("a");
        int lastA = s4.lastIndexOf("a");
        System.out.println(firstA + " " + lastA);

        int secondA = s4.indexOf("a ");
        System.out.println(secondA);

        int thirdA = s4.indexOf("a C");
        System.out.println(thirdA);

        int fourthA = s4.lastIndexOf("av");
        System.out.println(fourthA); //even if it starts from right side, it still looks for the given argument in sequence
        //second way to find fourthA
        int fourthA2 = s4.indexOf("Ca") + 1;
        System.out.println(fourthA2);
        System.out.println("-------------------------------------------");

        //replace() and replaceFirst() METHODS
        //replace(old value, new value) => replaces all the matching ones
        String s5 = "Java is fun, I love learning Java";
        s5 = s5.replace("Java", "Python");
        System.out.println(s5);

        String s6 = "sukraydin29@yahoo.com";
        s6 = s6.replace("yahoo", "gmail");
        System.out.println(s6);

        String s7 = "Java Java Python Python C# C# C++ C++ Python Python Python Python";
        s7 = s7.replace("Python", "").replace("   ", " ");
        //in the second part, we are replacing 3 spaces with 1 space.
        System.out.println(s7);

        String s8 = "C# is fun, C# is cool"; //replace the second C# with Java
        s8 = s8.replace(", C#", ", Java");
        System.out.println(s8);

        //replaceFirst(old value, new value) => replaces the first matching one only
        String s9 = "Java Java Java";
        s9 = s9.replaceFirst("Java", "Python");
        System.out.println(s9);

        String s10 = "C# is fun, C# is cool";
        s10 = s10.replaceFirst("C#", "Java");
        System.out.println(s10);

        String s11 = "Java"; //replace the second a with ş
        s11 = s11.replace("va","vş");
        System.out.println(s11);
        System.out.println("-------------------------------------------");

        //substring(beginning index, ending index)
        //ending index is always excluded
        String s12 = "Javac School";
        String brand = s12.substring(0,4);//prints Java => it stops at ending index
        brand = s12.substring(0,4+1);//prints Javac
        System.out.println(brand);

        String type = s12.substring(6,12);
        type = s12.substring(6); //prints rest of it, much better
        System.out.println(type);

        String s13 = "Java Programming Language";//print each word separately, don't count the index numbers
        int index1 = s13.indexOf(" ");
        String str1 = s13.substring(0,index1);
        int index2 = s13.lastIndexOf(" ");
        String str2 = s13.substring(index1+1, index2);
        String str3 = s13.substring(index2+1);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        String email = "sukraydin29@gmail.com"; //get the domain of the e-mail.
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(domain);

        String s14 = "Java is fun, Java is cool";
        String first = s14.substring(0,11);
        String second = s14.substring(s14.indexOf(",")+2);
        System.out.println(first);
        System.out.println(second);
        System.out.println("-------------------------------------------");
    }
}
