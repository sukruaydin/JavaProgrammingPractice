package day09_IfElseAndMultiBranchIfs.IfAndElse;

public class EligibleToBuyAlcohol {

    public static void main(String[] args) {
        // name is eligible to buy alcohol or not, >= 18
        String name = "Alua";
        int age = 4;
        if(age >= 18){
            System.out.println(name + " is eligible to buy alcohol, enjoy");
        }else{
            System.out.println(name + " is NOT eligible to buy alcohol, go and ask you mom");
        }

    }


}
