package ex_18012025.polymorphism.methodoverloading;
//compile time polymorphism||static polymorphism||method overloading
public class Lab181 {
    public static void main(String[] args) {
        MathOperations mo=new MathOperations();
        int result=mo.add(29,34);
        System.out.println(result);
        double result1=mo.add(34.89,34.089);
        System.out.println(result1);
        String result2=mo.add("Sanket","Umrani");
        System.out.println(result2);
        String result3=mo.add("Shreyas",100);
        System.out.println(result3);



    }

}
