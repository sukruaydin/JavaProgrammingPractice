package day22_MultiDimentionalArrays.Tasks;

public class Items {

    public static void main(String[] args) {

        String[][] items = {{"Apple", "Banana", "Grape", "Avocado"},
                            {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                            {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}};

        //1. print the following output: (add \t between two words)
        for (String[] arr1D : items) {
            for (String each : arr1D) {
                System.out.print(each+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");

        //2. print the following output: (add \t between two words)
        for (int i = 0; i < items.length; i++){
            for (int j = items[i].length-1; j >= 0; j--){
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------------");

        //3. print the following output: (add \t between two words)
        for (int i = items.length-1; i >= 0; i--){
            for (int j = 0; j < items[i].length; j++){
                System.out.print(items[i][j]+"\t");
            }
            System.out.println();
        }


    }

}
