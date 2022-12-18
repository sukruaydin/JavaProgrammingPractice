package day27_WrapperClasses.Tasks;

import java.util.Arrays;

public class Insert {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        arr = insert(arr,0,88);
        System.out.println(Arrays.toString(arr));


        String[] s = {"şükrü","hale"};
        s = insert(s,1,"aydın");
        System.out.println(Arrays.toString(s));
        s = insert(s,3,"aydın");
        //s = ArraysUtility.addElementToArray(s,"aydın");
        System.out.println(Arrays.toString(s));

    }

    //inserts the given element to the given index(including length+1) in int array, returns array
    public static int[] insert(int[] arr, int index, int element){
        if (index < 0 || index > arr.length){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        int[] inserted = new int[arr.length+1];

        int k = 0;
        for (int i = 0; i < inserted.length; i++) {
            if (i == index){
                inserted[i] = element;
                continue;
            }
            inserted[i] = arr[k++];
        }

        return inserted;
    }
    //inserts the given element to the given index(including length+1) in double array, returns array
    public static double[] insert(double[] arr, int index, double element){
        if (index < 0 || index > arr.length){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        double[] inserted = new double[arr.length+1];

        int k = 0;
        for (int i = 0; i < inserted.length; i++) {
            if (i == index){
                inserted[i] = element;
                continue;
            }
            inserted[i] = arr[k++];
        }

        return inserted;
    }
    //inserts the given element to the given index(including length+1) in char array, returns array
    public static char[] insert(char[] arr, int index, char element){
        if (index < 0 || index > arr.length){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        char[] inserted = new char[arr.length+1];

        int k = 0;
        for (int i = 0; i < inserted.length; i++) {
            if (i == index){
                inserted[i] = element;
                continue;
            }
            inserted[i] = arr[k++];
        }

        return inserted;
    }
    //inserts the given element to the given index(including length+1) in String array, returns array
    public static String[] insert(String[] arr, int index, String element){
        if (index < 0 || index > arr.length){
            System.err.println("Invalid index: "+ index);
            System.exit(0);
        }

        String[] inserted = new String[arr.length+1];

        int k = 0;
        for (int i = 0; i < inserted.length; i++) {
            if (i == index){
                inserted[i] = element;
                continue;
            }
            inserted[i] = arr[k++];
        }

        return inserted;
    }

}
