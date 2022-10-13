package day10_NestedIfAndTernaries.Tasks;

public class AgeGroups {

    public static void main(String[] args) {

        int age = 145;
        String group;

        if (age >= 1 && age <= 150){

            if (age <= 20){
                group = "teenager";
            } else if (age >= 21 && age <= 55) {
                group = "adult";
            }else{
                group = "senior";
            }

        }else {
            group = "invalid";
        }
        System.out.println("group = " + group);
    }
}
