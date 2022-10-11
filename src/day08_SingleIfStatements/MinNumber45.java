package day08_SingleIfStatements;

public class MinNumber45 {

    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 2;

        boolean n1isMin = n1 < n2;
        boolean n2isMin = n2 < n1;
        boolean equal = n1 == n2;

        if (n1isMin){
            System.out.println(n1 + " is the min number");
        }
        if (n2isMin){
            System.out.println(n2 + " is min number");
        }
        if (equal){
            System.out.println(n1 + " is equal to " + n2);
        }

    }

}
