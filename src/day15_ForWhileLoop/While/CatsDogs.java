package day15_ForWhileLoop.While;

public class CatsDogs {

    public static void main(String[] args) {
        //count how many cat's and dog's the string has
        String s = "Cat cAt cat CAT doG dog";
        s = s.toLowerCase();

        int countCat = 0;
        while (s.contains("cat")){
            s = s.replaceFirst("cat", "");
            countCat++;
        }

        int countDog = 0;
        while (s.contains("dog")){
            s = s.replaceFirst("dog", "");
            countDog++;
        }
        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);
    }
}
