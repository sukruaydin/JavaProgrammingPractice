package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {

        //assignment = , for updating the value
        int num1 = 100;
        System.out.println("num1 = " + num1); //100
        num1 = 200; //you can't declare int again, otherwise you ll get an error
        System.out.println("num1 = " + num1); //200

        String word = "cigarette";
        System.out.println("word = " + word);
        word = "don't smoke";
        System.out.println("word = " + word);
        System.out.println("-------------------------------------------------");


        //additional assignment +=, for updating the value
        int num2 = 100;
        System.out.println("num2 = " + num2);
        num2 += 20;
        System.out.println("num2 = " + num2);
        String name = "Şükrü";
        name += " Aydın";
        System.out.println("name = " + name);
        double availableBalance = 1000.5;
        System.out.println("availableBalance = $" + availableBalance);
        //deposit 300$
        availableBalance += 300;
        System.out.println("availableBalance = $" + availableBalance);
        System.out.println("-------------------------------------------------");


        //subtraction assignment
        int num3 = 50;
        System.out.println("num3 = " + num3);
        num3 -= 12;
        System.out.println("num3 = " + num3);
        double availableBalance2 = 1000.5;
        System.out.println("availableBalance2 = $" + availableBalance2);
        //withdraw 500$
        availableBalance2 -= 500; //500.5
        System.out.println("availableBalance2 = $" + availableBalance2);
        //you can not apply this operator to String
        //withdraw 200$, then deposit 300$
        availableBalance2 -= 200; //300.5$
        availableBalance2 += 300; //600.5$
        System.out.println("availableBalance2 = $" + availableBalance2);
        System.out.println("-------------------------------------------------");


        //multiplication assignment
        double salary = 50_000.5; //after graduation from Cydeo
        salary *= 2; //same as salary = salary *2
        System.out.println("salary = $" + salary);
        double equfi = 0.021; //1_000_000 times valued
        equfi *= 1_000_000;
        System.out.println("equfi = $" + equfi);
        System.out.println("-------------------------------------------------");


        //division assignment
        double money2 = 326.5; //how many tenners, please declare money2 above 10
        System.out.println("money2 = TL " + money2);
        money2 /= 10; //same as num4 = num4 / 2
        System.out.println("tenners = " + (int)money2);
        System.out.println("-------------------------------------------------");


        //remainder assignment
        double num5 = 100;
        num5 %= 3; //1
        System.out.println("num5 = " + num5);

        int TL = 123; //how many coins
        System.out.println("money = " + TL);
        TL %= 5; //2 coins
        System.out.println("coins = " + TL);
        System.out.println("-------------------------------------------------");

        //extra example
        int balance = 3500;
        int insurance = 153;
        //how many months can i pay?
        int howManyMonths = balance / insurance;
        System.out.println("how many months = " + howManyMonths);
        //what would be the last balance
        balance %= insurance;
        System.out.println("last balance = " + balance);




    }

}
