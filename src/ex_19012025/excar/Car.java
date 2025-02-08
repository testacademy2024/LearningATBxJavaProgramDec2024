package ex_19012025.excar;

abstract class Car extends Engine {
    // Engine
    // GearBox
    // Keys

    // Tesla is A Car
    // Tesla - DRIVE()
//Right Click and choose Generate and select OverRidden methods

    @Override
    void start() {
        System.out.println("Start a Car");
    }

    @Override
    void stop() {
        System.out.println("Stop a car");
    }

    @Override
    void speed() {
        System.out.println("Speed of  the car");
    }

    @Override
    void partGearBox() {
        System.out.println("Gearbox Use");
    }

    @Override
    void openCar() {
        System.out.println("Open Car");
    }
}
