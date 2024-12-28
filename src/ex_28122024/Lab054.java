package ex_28122024;

public class Lab054 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 23;
        int c = a+b;
        System.out.println(c);

        char a1 = 'A';
        char b1 = 'B';
        //char c2= a1+b1; //this operation is not possible
        int c1 = a1+b1; // AB ->char  char is almost integers
        System.out.println(c1); //(65+66)
        System.out.println('A' == 65);
        System.out.println('B' == 69);

    }
}
