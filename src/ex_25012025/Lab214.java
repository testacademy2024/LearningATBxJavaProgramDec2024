package ex_25012025;

public class Lab214 {
    public static void main(String[] args) {
        String s1 = null;
        try {
            s1 = "Pramod";
            String a1 = args[0];
            int a = 10 / 0;
            s1 = null;
            System.out.println(s1.trim());
        } catch (Exception e) {
            System.out.println("There is some problem with your code");
            System.out.println(e.getMessage());
        }

        System.out.println("End of Program!");
    }
}
