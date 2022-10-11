package day08_SingleIfStatements;

public class EligibleToVote {

    public static void main(String[] args) {

        // eligibleToVote, must be USA citizen, age over 18
        String name = "Şükrü",
                citizen = "TR";
        int age = 29;
        boolean isEligible = citizen == "USA" && age >=21;
        if(isEligible){
            System.out.println(name + " is eligible to vote for great America");
        }
        if(!isEligible){
            System.out.println(name + " is not eligible to vote for great America");
        }



    }

}
