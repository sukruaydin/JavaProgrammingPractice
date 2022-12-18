package day22_MultiDimentionalArrays.Tasks;

public class CydeoStudent {

    public static void main(String[] args) {

        String[] batch25Group1 = {"Jilil", "Ayhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};
        String[][] batch25Groups = new String[3][];
        batch25Groups[0] = batch25Group1;
        batch25Groups[1] = batch25Group2;
        batch25Groups[2] = batch25Group3;

        String[] batch24Group1 = {"Fuat", "Kenan", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadia", "Murodil"};
        String[][] batch24Groups = new String[3][];
        batch24Groups[0] = batch24Group1;
        batch24Groups[1] = batch24Group2;
        batch24Groups[2] = batch24Group3;

        String[][][] cydeoStudents = new String[2][][];
        cydeoStudents[0] = batch25Groups;
        cydeoStudents[1] = batch24Groups;

        for (String[][] arr2D : cydeoStudents) {
            for (String[] arr1D : arr2D) {
                for (String each : arr1D) {
                    System.out.print(each+", ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

}
