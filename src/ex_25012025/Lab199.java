package ex_25012025;
// A->called->SIB will execute; new A()->called->IIB will execute;A.discount->called
public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
        a.age=12;
        System.out.println(A.discount);
        a.m2();
        A.m1();  //For static method no need to create object, directly access it with the help of class name
    }

}
class A{
    int age=10;  //Instance Variable
    static int discount = 199; // static variable
    // SIB - STATIC initialization block
    static{
        System.out.println("One time Load SIB");
    }
    // IIB - instance initialization block
    {
        System.out.println("IIB when object is created");
    }
    static void m1()  //complete static method
    {
        System.out.println("m1");
        System.out.println(discount);
    }
    void m2(){ //complete non-static method
        System.out.println("m2");
        System.out.println(discount);
    }

}
