package day40_FinalKeyword.Class;

public class FinalKeyword {

    //final keyword--> variables & methods with final keyword can NOT be changeable once assigned
    //since it is NOT changeable, it can NOT be overridden too

    //without constructor, it gives compile error
    final char gender;
    final String birthday;
    final static String name = "şükrü";

    public FinalKeyword(char gender, String birthday) {
        this.gender = gender;
        this.birthday = birthday;
    }

    public String toString() {
        return "FinalKeyword{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    public static void main(String[] args) {

        //final keyword--> variables & methods with final keyword can NOT be changeable once assigned


        final double pi = 3.14;
        // pi = 3.15; compile error


        final String name;
        name = "Java";
        // name = "Python"; compile error
        System.out.println(name);


        FinalKeyword obj = new FinalKeyword('M',"6th Jan 1993");
        System.out.println(obj);
        //obj.birthday = "7th Jan 1993"; since it is with final keyword, we can NOT modify it
        //FinalKeyword.name = "aydın"; since it is with final keyword, we can NOT modify it



    }

}
