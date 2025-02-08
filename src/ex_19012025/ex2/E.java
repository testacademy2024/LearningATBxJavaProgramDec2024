package ex_19012025.ex2;

public interface E {
    void StartEngine();
    void StopEngine();
//Interface does not have below complete methods without default keyword
    default void haltingEngineJustStart()
    {
        System.out.println("Halt the Engine Just Start");
    }
    default void haltingEngineJustStop()
    {
        System.out.println("Halt the Engine Just Stop");
    }
    static void M1() {
        System.out.println("M1");
    }

    void m2();
    void m3();
}
