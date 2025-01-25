package ex_12012025.HasARelationship.ex;

public class Car {
    protected void  StartTheCar()
    {
        new Tyres().rolling();
        new Engine().start();
    }
}
