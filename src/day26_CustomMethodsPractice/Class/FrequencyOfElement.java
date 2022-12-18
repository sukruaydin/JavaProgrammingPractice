package day26_CustomMethodsPractice.Class;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] arr = {1,1,2,1,5,1,6};
        int howManyOne = frequencyOfElement(arr,1);
        System.out.println("howManyOne = " + howManyOne);
        System.out.println("-----------------------------------");

        double[] arr1 = {2.2,3.3,5.6,3.3};
        System.out.println(frequencyOfElement(arr1,3.3));
        System.out.println("-----------------------------------");

        String[] array= {"şükrü","aydın","anna","anna","şükrü"};
        int howManySukru = frequencyOfElement(array,"ŞÜKRÜ");
        System.out.println("howManySukru = " + howManySukru);
        System.out.println("-----------------------------------");




    }
    //returns the frequency of given element from the given int array
    public static int frequencyOfElement(int[] arr, int element){

        int count = 0;
        for (int each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of given element from the given double array
    public static int frequencyOfElement(double[] arr, double element){

        int count = 0;
        for (double each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of given element from the given String array
    public static int frequencyOfElement(String[] arr, String element){

        int count = 0;
        for (String each : arr) {
            if (each.equals(element)){
                count++;
            }
        }
        return count;
    }
    //returns the frequency of given element from the given char array
    public static int frequencyOfElement(char[] arr, char element){

        int count = 0;
        for (char each : arr) {
            if (each == element){
                count++;
            }
        }
        return count;
    }


}
