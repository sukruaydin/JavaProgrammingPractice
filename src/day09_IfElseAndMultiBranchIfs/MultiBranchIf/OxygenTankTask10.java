package day09_IfElseAndMultiBranchIfs.MultiBranchIf;

public class OxygenTankTask10 {

    public static void main(String[] args) {
        //percentage given between 0~100
        int percentage = 55;
        String message;

        boolean a = percentage > 90;
        boolean b = percentage > 80 && !a;
        boolean c = percentage > 70 && !a && !b;
        boolean d = percentage > 60 && !a && !b && !c;

        if (a){
            message = "Your tank is full";
        } else if (b) {
            message = "Still okay";
        } else if (c) {
            message = "Don't go too far";
        } else if (d) {
            message = "Start to head back";
        }else {
            message = "Be careful now you at at 50%";
        }
        System.out.println("message = " + message);
    }

}
