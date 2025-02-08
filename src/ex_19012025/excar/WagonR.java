package ex_19012025.excar;

public class WagonR extends Engine {
    void Drive()
    {
        openCar();
        start();
        partGearBox();
        stop();
    }

    @Override
    void start() {
        System.out.println("WagonR is Starting");
    }

    @Override
    void stop() {
        System.out.println("WagonRis stopping");
    }

    @Override
    void speed() {
        System.out.println("100KMPH");
    }

    @Override
    void partGearBox() {
        System.out.println("Manual Gear Transmission");
    }

    @Override
    void openCar() {
        System.out.println("Lock&Key to Open Doors");
    }
}
