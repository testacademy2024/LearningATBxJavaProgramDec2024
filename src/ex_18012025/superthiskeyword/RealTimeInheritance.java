package ex_18012025.superthiskeyword;

public class RealTimeInheritance {
    public static void main(String[] args) {
        BaseClass t1 = new TestCase1(); // Dynamic Dispatch // Runtime
        //t1.setBrowsers("opera",true);
        t1.openbrowsers();
        t1.openbrowsers();
        t1.closeBrowser();

    }


}
class TestCase1 extends BaseClass{
    // TestCase is A Type of BaseCalss - Single Inheritance
    TestCase1(){
        super(); //Direct call to parent class
        this.setBrowsers("edge",true);
    }
    @Override
    public void setBrowsers(String browsers,boolean IsAuth){
        this.setBrowsers("Chrome",false);
        super.setBrowsers("Firefox",true);
    }
}


class BaseClass{
    BaseClass(){
        System.out.println("DC - BaseClass");
    }
    BaseClass(String b){
        System.out.println("CC - BaseClass");
    }
    private String Browsers;

    public String getBrowsers() {
        return Browsers;
    }

    public void setBrowsers(String browsers,boolean IsAuth) {
        if(IsAuth){
            this.Browsers = browsers;
        }
        else {
            System.out.println("Not Allowed");
        }

    }

void openbrowsers()
{
    System.out.println("Chrome Browser!!");
}
    void openbrowsers(String browsername)
    {
        System.out.println("Open Browser!! -> " + browsername);
    }
    void closeBrowser() {
        System.out.println("Close Browser!!");
    }
}

