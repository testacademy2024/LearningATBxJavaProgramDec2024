package ex_18012025.encapsulation;

public class Lab180 {
    public static void main(String[] args) {
        ICICIBank icbadmin=new ICICIBank("Sanket",100);
        System.out.println(icbadmin.getName());
        icbadmin.setName("Shreyas",true);
        System.out.println(icbadmin.getName());
        System.out.println(icbadmin.getBal());
        icbadmin.setBal(1000,true);
        System.out.println(icbadmin.getBal());
        System.out.println("**********************");

        ICICIBank icbuser1=new ICICIBank("Prithvi",10000);
        System.out.println(icbuser1.getName());
        icbuser1.setName("Chandru",false);
        System.out.println(icbuser1.getName());
        System.out.println(icbuser1.getBal());
        icbuser1.setBal(50000,false);
        System.out.println(icbuser1.getBal());



    }

}
