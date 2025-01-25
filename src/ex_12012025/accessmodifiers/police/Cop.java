package ex_12012025.accessmodifiers.police;

public class Cop {
    protected int gun;  //
    protected String idCard; //
    protected Cop(int gun)  //parameterized single argument constructor
    {
this.gun=gun;

    }
    protected void canIShoot()
    {
        System.out.println("Yes, You can!!");
    }

}
