package day17_WhileDoWhileBranching.Tasks;

import java.util.Scanner;

public class EkremDivisible {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            scan.close();
            int n1 =15;
            String result15="";
            do {
                result15=result15+n1+" ";
                n1+=15;
            }while ((n1%15==0)&&n1<=num);
            result15=result15.substring(0,result15.length()-1);
            System.out.println("Divisible by 15: "+result15);

            int n2=5;
            String result5="";
            do {
                result5=result5+n2+" ";
                n2+=5;
            }while ((n2%5==0)&&n2<=num);
            result5=result5.substring(0,result5.length()-1);
            System.out.println("Divisible by 5: "+result5);

            int n3=3;
            String result3="";
            do {
                result3=result3+n3+" ";
                n3+=3;
            }while ((n3%3==0)&&n3<=num);
            result3=result3.substring(0,result3.length()-1);
            System.out.println("Divisible by 3: "+result3);

        }


    }

