package day36_Inheritance.Tasks.SportTask;

public class Olympics {

    public static void main(String[] args) {

        Football football1 = new Football();
        football1.setInfo("FB-GS",22,4,"abcde",false);

        System.out.println("football1 = " + football1);

        System.out.println("-----------------------------------");

        Basketball basketball1 = new Basketball();
        basketball1.setInfo("Efes-FB", 10,3,"qwert",4);

        System.out.println("basketball1 = " + basketball1);


    }

}
