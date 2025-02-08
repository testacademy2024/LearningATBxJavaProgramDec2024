package ex_19012025.exMultipleInheritance;

public class Son implements Father,Mother{
    @Override
    public void loan() {
        System.out.println("This is only one function");
    }

    @Override
    public void home() {

    }
}
