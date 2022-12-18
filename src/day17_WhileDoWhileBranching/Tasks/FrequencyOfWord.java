package day17_WhileDoWhileBranching.Tasks;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String s = "şükrü aydın şükrü şükrü hale bekir";
        int howMany = frequencyOfWord(s,"şükrü");
        System.out.println("howMany = " + howMany);


    }

    public static int frequencyOfWord(String sentence, String word){

        int count = 0;
        for (int i = 0; i <= sentence.length()-word.length(); i++) {
            if (sentence.substring(i,i+word.length()).equalsIgnoreCase(word)){
                count++;
            }
        }
        return count;
    }

}
