package ex_12012025;

public class ATBPerson {
    String name;
    String phone;

    // DC
    ATBPerson() {
        System.out.println("Object is created!");
    }
    ATBPerson(String nameGiven){
        this.name = nameGiven;
        // This current class.
    }
    ATBPerson(String nameGiven,String phoneNumber)
    {
        this.name=nameGiven;
        this.phone=phoneNumber;
    }
}
