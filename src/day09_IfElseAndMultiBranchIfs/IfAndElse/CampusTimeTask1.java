package day09_IfElseAndMultiBranchIfs.IfAndElse;

public class CampusTimeTask1 {

    public static void main(String[] args) {
        //time 1~24
        int time = 24;
        String openOrClose;
        if (time >= 8 && time <= 23){
            openOrClose = "campus is open";
        }else{
            openOrClose = "campus is closed";
        }
        System.out.println(openOrClose);
    }

}
