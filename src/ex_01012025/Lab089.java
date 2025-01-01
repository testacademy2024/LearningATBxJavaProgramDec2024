package ex_01012025;

import java.util.Scanner;

public class Lab089 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age=sc.nextInt();
        if(age>18)
        {
            System.out.println("Goa");
        } else if (age==18) {
            System.out.println("Mumbai");

        }
        else {
            System.out.println("Enjoy at home");
        }

    }
}
