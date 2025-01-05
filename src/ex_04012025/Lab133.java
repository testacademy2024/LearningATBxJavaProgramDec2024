package ex_04012025;

import java.util.Scanner;

public class Lab133 {
    // For and if

    // FizzBuzz Problem:
    // Write a program that prints numbers from 1 to 100.
    // For multiples of 3, print "Fizz" instead of the number,
    // and for the multiples of 5, print "Buzz".
    // For numbers which are multiples of both 3 and 5,
    // print "FizzBuzz".
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the max number");
        int n=sc.nextInt();
        for (int i = 0; i <n ; i++) {
            if(i%3==0&&i%5==0)  ///Multiple conditions to be validated needs to be on top of the execution hierrachy
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

        }
    }
}
