package Inheritance2;

public class Human extends Animal{
    //extendsn keyword is used to inherit from parent class.

    public void think(){
        System.out.println("Humans can think");
    }
    public void talk(){
        System.out.println("Humans can talk");
    }

    //overriding the parent class methods.
    @Override
    public void see() {
        System.out.println("Human can see");
    }
    @Override
    public void smell() {
        System.out.println("Humans can smell");
    }
    @Override
    public void breathe() {
        System.out.println("Humans breathe");
    }
}
