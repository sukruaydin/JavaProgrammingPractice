package day11_SwitchCase.Tasks;

public class Browser {

    public static void main(String[] args) {

        String browserName = "cydeo";
        String result = "";

        switch (browserName){

            case "chrome":
                result = "chrome browser is selected";
                break;

            case "firefox":
                result = "firefox browser is selected";
                break;

            case "opera":
                result = "opera browser is selected";
                break;

            case "safari":
                result = "safari browser is selected";
                break;

            case "edge":
                result = "edge browser is selected";
                break;

            default:
                result = browserName + " is an invalid browser name";
        }
        System.out.println(result);
    }

}
