package ex_19012025.RealLifeEx;

abstract public class BaseClass extends GrandBaseClass {
    // Web Automation
    // Single
    // Hide the Functionality of the open and close Browser.

abstract String OpenBrowser(String Browser);
abstract String CloseBrowser(String Browser);

    @Override
    void takeScreenShot() {
        System.out.println("Ok Taking ScreenShot");
    }

    }

