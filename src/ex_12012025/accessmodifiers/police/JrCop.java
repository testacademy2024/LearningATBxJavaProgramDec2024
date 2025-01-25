package ex_12012025.accessmodifiers.police;

public class JrCop {
    public static void main(String[] args) {
        Cop c=new Cop(100);
        System.out.println(c.gun);
      c.canIShoot();
    }



}
