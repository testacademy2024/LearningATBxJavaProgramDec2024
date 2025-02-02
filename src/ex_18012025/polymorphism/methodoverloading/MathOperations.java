package ex_18012025.polymorphism.methodoverloading;

public class MathOperations {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b)
    {
        return a+b;
    }
    String add(String a,String b)
    {
        return a+b;
    }
    String add(String a,int b)
    {
        return a+b;
    }

}
