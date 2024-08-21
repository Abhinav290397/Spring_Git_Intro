package Inheritance2;

public class Dog extends Animal{
    public void barks(){
        System.out.println("Dog barks");
    }

    //overriding the parent class(human class) methods.
    @Override
    public void see() {
        System.out.println("Dog can see");
    }

    @Override
    public void smell() {
        System.out.println("Dogs can smaell");
    }

    @Override
    public void breathe() {
        System.out.println("Dogs breathe");
    }
}
