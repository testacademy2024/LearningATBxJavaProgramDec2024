package ex_28122024;

public class Lab056 {
    public static void main(String[] args) {
        // Type Casting - Source and Destination conversion
        // Widening - Implicit, Explicit - lossless
        // Narrowing - Implicit, Explicit(with data type), loss


        // Widening
        byte b=10;
        int a=b; // VALID – Implicit Casting - JVM----automatically JVM does it
        int a1= (int)b; // VALID – Explicit Casting----even if you explicitly mention then JVM accepts it
        System.out.println(a1);

        // Narrowing
        double val = 300000.34566;
        //byte b1 = val; // Invalid - Implicit Casting - JVM
        short b1 = (short) val; // InVALID – Explicit Casting - // Loss of data
        System.out.println(b1);





    }
}
