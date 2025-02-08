package ex_19012025.RealLifeEx;

public class Lab189 {
    public static void main(String[] args) {
        Chrome c=new Chrome();
        c.OpenBrowser("Chrome is opening");
        c.CloseBrowser("Chrome is closed");
        c.takeScreenShot();
        FireFox f=new FireFox();
        f.OpenBrowser("Firefox is opening");
        f.CloseBrowser("FireFox is closed");
        f.takeScreenShot();
    }
}
