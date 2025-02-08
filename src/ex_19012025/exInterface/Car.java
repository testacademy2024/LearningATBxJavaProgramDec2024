package ex_19012025.exInterface;

public class Car implements Engine{
    @Override
    public void StartEngine() {
        System.out.println("WagonR is starting");
    }

    @Override
    public void StopEngine() {
        System.out.println("WagonR is stopping");

    }
}
