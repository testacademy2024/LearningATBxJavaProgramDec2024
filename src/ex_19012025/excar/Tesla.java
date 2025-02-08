package ex_19012025.excar;

public class Tesla extends Engine {
    void Drive()
    {
        openCar();
        start();
        partGearBox();
        stop();
    }


    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stopping Tesla");
    }

    @Override
    void speed() {
        System.out.println("500KMPH");
    }

    @Override
    void partGearBox() {
        System.out.println("Pure Electric");

    }

    @Override
    void openCar() {
        System.out.println("Feather Touch Keys to Open");

    }
}
