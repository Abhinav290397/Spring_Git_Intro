package Inheritance1;

import Inheritance2.Animal;
import Inheritance2.Dog;
import Inheritance2.Fish;
import Inheritance2.Human;

//Inheritance -  It means inheriting the properties and methods of Parent class by child class.
public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.see();
        a1.smell();
        a1.breathe();
        System.out.println("Animals generally have " + a1.legs + " Legs" );
        System.out.println();

        Human h1 = new Human();
        //methods in Human class.
        h1.think();
        h1.talk();
        //As human is child class of Animal class so humans class can access all methods of Animal class.(only public methods/variables)
        h1.see();
        h1.smell();
        h1.breathe();
        System.out.println("Humans have " + h1.legs + "Legs");
        System.out.println();

        Dog d1 = new Dog();
        //method inside dog class
        d1.barks();
        //Methods inside Animal class(parent class.
        d1.see();
        d1.smell();
        d1.breathe();
        d1.legs = 4;
        System.out.println("Dogs have " + d1.legs + "legs");
        System.out.println();


        Fish f1 = new Fish();
        f1.swim();

        f1.see();
        f1.smell();
        f1.breathe();

        f1.legs = 0;
        System.out.println("Fish has "  + f1.legs +"legs");

        //Method Overriding -
        // In the above case we are just calling the method of parent class as it is,but we -
        //have to modify the parent method wrt our need ,here comes the concept of method overiding.

        //Method overiding is changing the definition of method of parent class but same name.
        //refer to human class,dog class.(i not implement method overriding in fish class,pls compare o/p)
    }
}
