package day20_Arrays.Tasks;

public class Grades {

    public static void main(String[] args) {

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = (scores[i]<=100&&scores[i]>=90)?'A':(scores[i]<=89&&scores[i]>=80)? 'B':(scores[i]<=79&&scores[i]>=70? 'C' :(scores[i]<=69&&scores[i]>=60)? 'D' : 'F');
        }

        String result = "";
        for (int i = 0; i < names.length; i++) {
            result = names[i]+"'s score is "+scores[i]+", and the grade is "+grades[i];
            System.out.println(result);
        }
    }
}
