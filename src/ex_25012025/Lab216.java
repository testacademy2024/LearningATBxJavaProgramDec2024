package ex_25012025;

public class Lab216 {
    public static void main(String[] Amit) {


        try {
            int a = 10/0;
        } catch (Exception pramod) {
            System.out.println("Div by Zero");
            //pramod.getMessage()
        } finally {
            System.out.println("I will be always Executed, anyHow!!");
        }
    }
}
