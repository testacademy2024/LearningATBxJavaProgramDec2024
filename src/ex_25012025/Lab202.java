package ex_25012025;

public class Lab202 {
    public static void main(String[] args) {
        Car c=new Car("Lamborghini");
        c.drive();
        System.out.println(c.make);
        // to access the inner class Object creation.
        Car.Gearbox cg = c.new Gearbox();
        cg.partofGearbox();
    }

}
class Car{
    String make;//instance variable

    public Car(String make) { //parametrized constructor
        this.make = make;
    }
    void drive()
    {
        System.out.println("You can drive car");
    }
    class Gearbox  //Inner Class
    {

void partofGearbox()
{
    System.out.println("PartofGearBox");
    System.out.println(make);  //Inner Class can access the variables from Outer Class
}
    }
    class Nutbolts
    {

    }
}