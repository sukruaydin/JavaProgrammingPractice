package day22_MultiDimentionalArrays.Class;

public class ForEachMultiDimentional {

    public static void main(String[] args) {

        int[][] numbers2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};

        for (int[] each1D : numbers2D) { //each1D = arrays
            for (int each : each1D){
                System.out.print(each+" "); //each == elements
            }
            System.out.println();
        }


    }

}
