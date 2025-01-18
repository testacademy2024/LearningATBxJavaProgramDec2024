package ex_05012025;

public class Lab142 {
    //final keyword to no primitive array does not affect in any way
    public static void main(String[] args) {
        final int[]ages=new int[4];
        ages[3]=78;
        System.out.println(ages[3]);
        //final is another name of constant in java
       //int a=10;//valid
        //a=90; //latest value is 90
        //System.out.println(a);
        final int a=10;//valid
        //a=90;  a cannot be set to 90 as final is set to a as 10 so output will be 10 and not 90
        System.out.println(a);

    }


}
