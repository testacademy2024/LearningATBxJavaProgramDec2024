package ex_01012025;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        // Max number in two inputs
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int user_input1=sc.nextInt();
        System.out.println("The first number is "+user_input1);
        System.out.println("Enter second number");
        int user_input2=sc.nextInt();
        System.out.println("The second number is "+user_input2);

        if(user_input1>user_input2)
        {
            System.out.println("First Number is Max");
        } else if (user_input2>user_input1)
        {
            System.out.println("Second Number is Max");
        }
        else{
            System.out.println("Both Numbers are Equal");
        }
    }

}
