package day38_Inheritance_MethodOverriding.Tasks.browserTask;

public class Firefox extends Browser{

    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }
    @Override
    public void closeBrowser() {
        System.out.println("closing firefox browser");
    }


}
