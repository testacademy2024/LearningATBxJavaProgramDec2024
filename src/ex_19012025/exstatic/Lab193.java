//Program Execution
/*
static block will be called
IIB
Parametrized Constructor
reference variable of Class
New Object
 */
package ex_19012025.exstatic;

import java.util.concurrent.atomic.AtomicBoolean;

public class Lab193 {
    public static void main(String[] args) {
        System.out.println(ATB.CourseName);
ATB a1=new ATB("Amit");
        System.out.println(a1.getName());
        ATB a2=new ATB("Tandon");
        System.out.println(a2.getName());

    }

}
class ATB{
    {
        System.out.println("IIB");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
        System.out.println("Reading from CSV file");
    }

    static {
        System.out.println("Load the class?, I will execute");
    }

    private String name;
    static String CourseName="ATB";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ATB(String name) {  //parametrized constructor
        this.name = name;
    }
    static void doAssignment(){
        System.out.println("Do Assignment");
    }
}

