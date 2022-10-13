package day10_NestedIfAndTernaries.NestedIf;

public class Browser {
    public static void main(String[] args) {

        String browserName = "edge";
        String result;

        if (browserName == "chrome" || browserName == "firefox" || browserName == "opera" ||
                browserName == "safari" || browserName == "edge"){

            if (browserName == "chrome"){
                result = "chrome browser is selected";
            } else if (browserName == "firefox") {
                result = "firefox browser is selected";
            }else if (browserName == "opera") {
                result = "opera browser is selected";
            }else if (browserName == "safari") {
                result = "safari browser is selected";
            }else{
                result = "edge browser is selected";
            }

        }else {
            result = "Invalid Browser Name";
        }
        System.out.println("result = " + result);
    }
}
