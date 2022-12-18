package day38_Inheritance_MethodOverriding.Tasks.browserTask;

public class ChromeBrowser extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening chrome browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("closing chrome browser");
    }


}
