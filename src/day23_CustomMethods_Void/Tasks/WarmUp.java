package day23_CustomMethods_Void.Tasks;

public class WarmUp {

    public static void main(String[] args) {

        initialsOfPerson("şükrü","aydın");
        domainOfEmail("sukraydin29@gmail.com");
        nameOfMonth(2);
        nameOfDay(4);
        howManyDaysMonth(1);

    }

    public static void initialsOfPerson(String firstName, String lastName){

        String s1 = firstName.charAt(0)+"";
        String s2 = lastName.charAt(0)+"";
        System.out.println(s1.toUpperCase()+"."+s2.toUpperCase()+".");

    }
    public static void domainOfEmail(String email){

        System.out.println(email.substring(email.indexOf('@')+1, email.lastIndexOf(".")));

    }
    public static void nameOfMonth(int monthNumber){

        switch (monthNumber){
            case 1:
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("apr");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("jun");
                break;
            case 7:
                System.out.println("jul");
                break;
            case 8:
                System.out.println("aug");
                break;
            case 9:
                System.out.println("sep");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
            default:
                System.out.println("invalid number given");
        }

    }
    public static void nameOfDay(int dayNumber){

        switch (dayNumber){

            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
            default:
                System.out.println("invalid number given");

        }

    }
    public static void howManyDaysMonth(int monthNumber){

        switch (monthNumber){

            case 4: case 6: case 9: case 10:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("31 days");

        }

    }

}
