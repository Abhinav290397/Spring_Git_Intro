package Inheritance2;

public class Animal {  //Parent class
    public int legs = 2; //if public is not declared it means its pvt. hence cant use in other files.

    public void see(){
        System.out.println("Animal can see");
    }
    public void smell(){
        System.out.println("Animal can smell");
    }
    public void breathe(){
        System.out.println("Animal can breathe");
    }
}
