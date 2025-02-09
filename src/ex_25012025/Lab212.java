package ex_25012025;

public class Lab212 {  //for each exception using try catch is a bad coding practice
    public static void main(String[] args) {
        String ip= null; // ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        }
        System.out.println(ip);
        int a= 0;// NumberFormatException
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
        int b= 0;// ArithmeticException
        try {
            b = 1000/a;
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
        System.out.println(b);
        System.out.println("End of the program");
    }
  }