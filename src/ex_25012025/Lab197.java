package ex_25012025;

public class Lab197 {
    public static void main(String[] args) {
        //Primitive to Wrapper
        String num="10";
        //int a=int(num);
       Integer a=Integer.valueOf(num);
        System.out.println(a);

        // String to Primitive?
       int a1 =Integer.parseInt(num);
        System.out.println(a1);
    }
}
