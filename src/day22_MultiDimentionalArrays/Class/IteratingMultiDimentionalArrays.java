package day22_MultiDimentionalArrays.Class;

public class IteratingMultiDimentionalArrays {

    public static void main(String[] args) {

        int[][] numbers2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};

        for (int i = 0; i < numbers2D.length; i++) {
            for (int j = 0; j < numbers2D[i].length; j++){
                System.out.print(numbers2D[i][j]+" ");
            }
            System.out.println();
        }

    }

}
