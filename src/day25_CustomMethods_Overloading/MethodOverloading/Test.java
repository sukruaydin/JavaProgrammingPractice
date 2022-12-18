package day25_CustomMethods_Overloading.MethodOverloading;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String s = "Java";
        StringUtility.printEachChar(s);
        System.out.println("----------------------------------");

        String reversed = StringUtility.reverse(s);
        System.out.println("reversed = " + reversed);
        System.out.println("----------------------------------");

        System.out.println(StringUtility.isPanlindrome("anna"));
        //count how many palindrome given string has
        String[] names = {"Anna","java","racecar","Python","Cydeo","Mom"};
        int count = 0;
        for (String each : names) {
            if (StringUtility.isPanlindrome(each)){
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("----------------------------------");

        String a = "şükrü";
        String b = "ürkşü";
        System.out.println(StringUtility.isAnagram(a,b));
        System.out.println("----------------------------------");

        String string = "aaaabbbc";
        System.out.println(StringUtility.removeDuplicates(string));
        System.out.println("----------------------------------");


    }
}
