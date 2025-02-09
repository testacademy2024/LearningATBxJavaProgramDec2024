package ex_25012025;

public class Lab215 {
    public static void main(String[] args) {
        final double pi=3.14;
        int a=0;
        try {
            int x=10/a;
        } catch (Exception e) {
            System.out.println("Divide by Zero");
            //System.out.println(e.getMessage()); //e.stacktrace printing
        } finally {
            System.out.println("I will be executed  anyhow");
        }
    }
}
