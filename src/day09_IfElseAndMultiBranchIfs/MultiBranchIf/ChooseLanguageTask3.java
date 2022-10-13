package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class ChooseLanguageTask3 {

    public static void main(String[] args) {
        //selection between 1~5
        int selection = 2;
        String language;

        if (selection == 1){
            language = "Hello, thank for your call";
        } else if (selection == 2) {
            language = "Hola, gracias para llamar";
        }else if (selection == 3) {
            language = "Merhaba, aradiginiz icin tesekkurler";
        }else if (selection == 4) {
            language = "Privet, spasibo za vash zvonok";
        }else{
            language = "Merci ,pour votre appel";
        }

        System.out.println(language);
    }

}
