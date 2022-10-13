package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class AgeGroupsTask5 {

    public static void main(String[] args) {

        int age = 88;
        String group;

        if (age >= 1 && age <= 2){
            group = "infant";
        } else if (age >= 3 && age <= 5) {
            group = "toddler";
        }else if (age >= 6 && age <= 9) {
            group = "kid";
        }else if (age >= 10 && age <= 12) {
            group = "pre-teen";
        }else if (age >= 13 && age <= 17) {
            group = "teenager";
        }else if (age >= 18 && age <= 20) {
            group = "young-adult";
        }else if (age >= 21 && age <= 39) {
            group = "adult";
        }else if (age >= 40 && age <= 49) {
            group = "young-middle";
        }else if (age >= 50 && age <= 54) {
            group = "middle";
        }else if (age >= 55 && age <= 64) {
            group = "very young senior citizen";
        }else if (age >= 65 && age <= 74) {
            group = "young senior citizen";
        }else if (age >= 75 && age <= 84) {
            group = "senior citizen";
        }else {
            group = "old senior citizen";
        }
        System.out.println(group);

    }

}
