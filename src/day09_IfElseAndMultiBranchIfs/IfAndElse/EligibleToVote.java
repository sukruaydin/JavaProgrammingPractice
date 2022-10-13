package day09_IfElseAndMultiBranchIfs.IfAndElse;

public class EligibleToVote {

    public static void main(String[] args) {
        //eligible to vote or not for USA, citizen must be USA && age >= 21
        String name = "Ahmet";
        String citizen = "USA";
        int age = 23;
        if (citizen == "USA" && age >=21){
            System.out.println(name + " is eligible to vote, make America great again");
        }else{
            System.out.println(name + " is NOT eligible to vote, then go and vote for Erdoğan");
        }


    }

}
