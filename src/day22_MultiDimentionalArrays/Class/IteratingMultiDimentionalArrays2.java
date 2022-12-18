package day22_MultiDimentionalArrays.Class;

public class IteratingMultiDimentionalArrays2 {

    public static void main(String[] args) {

        int[][] numbers2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};

        for (int i = numbers2D.length - 1; i >= 0; i--) {
            for (int j = 0; j < numbers2D[i].length; j++){
                System.out.print(numbers2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

        for (int i = 0; i < numbers2D.length; i++) {
            for (int j = numbers2D[i].length - 1; j >= 0; j--) {
                System.out.print(numbers2D[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------------------");

        for (int i = numbers2D.length - 1; i >= 0; i--) {
            for (int j = numbers2D[i].length - 1; j >= 0; j--) {
                System.out.print(numbers2D[i][j]+" ");
            }
            System.out.println();
        }



    }

}
