package day05_StringConcatenations;

import java.time.LocalDate;

public class HappyBirthDay {


        public static void main(String[] args) {


            happyBirthDay(1993, 5, 16);


        }


        public static void happyBirthDay(int year, int month, int day) {
            LocalDate birthday = LocalDate.of(year, month, day);
            LocalDate today = LocalDate.now();

            int month2 = today.getMonthValue();
            int day2 = today.getDayOfMonth();

            if (month2 == month && day == day2) {
                System.out.println("Today is your birthday!!!");
                System.out.println("   \n \t \t  \t \t    * * * * * * * * * * * * * * * * * * * * *");
                System.out.println("   \t \t  \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
                System.out.println("  \t \t  \t \t *  *                                       *  * ");
                System.out.println(" \t \t  \t \t*  *          Happy BirthDay To Ivan!        *  * ");
                System.out.println("  \t \t  \t \t *  *                                       *  * ");
                System.out.println("  \t \t   \t \t  *  * * * * * * * * * * * * * * * * * * * *  * ");
                System.out.println("   \t \t   \t \t    * * * * * * * * * * * * * * * * * * * * *");
                return;
            }
            System.out.println("Today is not your birthday yet");
        }

}


