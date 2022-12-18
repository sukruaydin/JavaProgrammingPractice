package day38_Inheritance_MethodOverriding.Tasks.browserTask;

public class BrowserObjects {

    public static void main(String[] args) {

        ChromeBrowser chromeBrowser = new ChromeBrowser();
        chromeBrowser.openBrowser();

        Firefox firefox = new Firefox();
        firefox.openBrowser();

        Opera opera = new Opera();
        opera.closeBrowser();

        Safari safari = new Safari();
        safari.closeBrowser();


    }

}
