package ex_05012025;

import java.util.Scanner;

public class Lab146 {
    public static void main(String[] args) {
        // Where we take the user input of the 5 subjects - Avg of the subject.
        //Logic Building-> Float Scanner Class

        Scanner sc=new Scanner(System.in);
        float[]marks=new float[5];
        System.out.println(marks.length);
        /*System.out.println("Enter the marks in Subject 1");
        marks[0]=sc.nextFloat();
        System.out.println("Enter the marks in Subject 2");
        marks[1]=sc.nextFloat();
        System.out.println("Enter the marks in Subject 3");
        marks[2]=sc.nextFloat();
        System.out.println("Enter the marks in Subject 4");
        marks[3]=sc.nextFloat();
        System.out.println("Enter the marks in Subject 5");
        marks[4]=sc.nextFloat();*/
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks in Subject " + (i + 1));
            marks[i] = sc.nextFloat();
        }

        float avg=marks[0]+marks[1]+marks[2]+marks[3]+marks[4]/5;
        System.out.println("the Average is->"+avg);
        int j = 0;
        while (j < marks.length){
            System.out.println(marks[j]);
            j++;
        }

        sc.close();

    }

}
