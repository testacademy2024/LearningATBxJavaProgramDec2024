package ex_18012025.polymorphism.methodoverriding;

public class Lab182 {
    // Method overidding | Runtime Poly
    public static void main(String[] args) {
        Hound h1=new Hound();
       h1.bark();

       Dog d1=new Dog();
       d1.bark();

       Dog d2=new Hound(); //Hound Class object is referred to Dog Class Reference Variable
        d2.bark(); //Hound(child class) object is created by Dog(Parent Class) reference variable d2. so Statements within Child class for a bark function will be printed

    }
}
