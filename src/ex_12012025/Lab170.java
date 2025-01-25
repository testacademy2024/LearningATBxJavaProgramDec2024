package ex_12012025;

import java.util.Scanner;

public class Lab170 {
    public static void main(String[] args) {
        /*BankAccount ba1 = new BankAccount();
        System.out.println(ba1.bankName);
        System.out.println(ba1.bankCode);
        System.out.println(ba1.balance);
        BankAccount ba2=new BankAccount("ICICI",10,"ICICI001");
        System.out.println(ba2.bankName);
        System.out.println(ba2.bankCode);
        System.out.println(ba2.balance);
     ba2.bankName="IDBI";
     ba2.bankCode="IDBI001";
     ba2.balance=101;
        System.out.println(ba2.bankName);
        System.out.println(ba2.bankCode);
        System.out.println(ba2.balance);
        BankAccount ba3=new BankAccount("HDFC",250);
        System.out.println(ba3.bankName);
        System.out.println(ba3.balance);
        BankAccount ba4=new BankAccount("AXIS");
        System.out.println(ba4.bankName);

        ba1.printDetails();
        ba2.printDetails();
        ba3.printDetails();
        ba4.printDetails();*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Name of the Bal!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank cODE!");

        String bCode = sc.next();

        BankAccount baicici = new BankAccount(bName, bal, bCode);


        baicici.printDetails();

        sc.close();


    }
}
