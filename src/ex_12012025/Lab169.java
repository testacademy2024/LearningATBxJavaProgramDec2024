package ex_12012025;

public class Lab169 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson();
        System.out.println(p0.name);
        ATBPerson p1 =new ATBPerson("Pramod");
        System.out.println(p1.name);
        ATBPerson p3=new ATBPerson("Amit");
        System.out.println(p3.name);
        System.out.println(p3.phone);
        ATBPerson p2=new ATBPerson("Praveen", "9087234321");
        System.out.println(p2.name);
        System.out.println(p2.phone);



    }
}
