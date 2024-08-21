package Abstraction1;

import Abstraction2.Sample02;

//Abstraction -
public class Main {
    public static void main(String[] args) {
        //We cannot create objects for abstract class.
        //(Why? -> Ans-Becoz the abstract method present in abstract class( i.e method not implemented),we cant access anything)

        //To access abstract method we have to create object of child class in which abstract method implemented.
        Sample02 s2 = new Sample02();
        s2.universe();
        s2.multiverse();


    }
}
