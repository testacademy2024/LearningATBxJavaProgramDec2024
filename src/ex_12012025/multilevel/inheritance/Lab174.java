package ex_12012025.multilevel.inheritance;

public class Lab174  {
    public static void main(String[] args) {
        // Multi Level
        // GF -> F -> Child
        Child c1 = new Child();
        c1.home(); // If name is same C -> F -> GF
        c1.c();
        c1.gf();
        c1.f();
        c1.extra();

    }
}
