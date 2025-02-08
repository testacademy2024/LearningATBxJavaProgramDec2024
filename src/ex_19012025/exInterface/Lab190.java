package ex_19012025.exInterface;

public class Lab190 {
    // Interface - Hide the implementation
    // Interface variables will be inherited to subclasses.
    // interface is a keyword which is used to define User Defined Datatypes.
    public static void main(String[] args) {
        Car c=new Car();
        c.StartEngine();
        c.StopEngine();
    }
}
