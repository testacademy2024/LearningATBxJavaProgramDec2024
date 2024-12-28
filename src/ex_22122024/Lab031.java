package ex_22122024;

public class Lab031 {
    public static void main(String[] args) {
        // if we want to use a constant then use final keyword
        final int A=99;
        //A= 100;  this will not work as initialization of int A is final
        System.out.println(A);
        final String STR="TTA";
        //STR="TTB";  //this will not work as initialization of int A is final
        System.out.println(STR);
        final double D1=999.99;
        //D1=100.010101;  //this will not work as initialization of int A is final
        System.out.println(D1);
    }
}
