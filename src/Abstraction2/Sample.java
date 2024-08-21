package Abstraction2;

//For abstraction, class must be abstract.
//Abstract class have the abstract methods.
//Abstract method does not have body.
//Abstract class can have concrete/normal methods(having body).

public abstract class Sample {
    public abstract void universe(); //abstract method

    public void multiverse(){   //concrete/normal Method
        System.out.println("Inside the multiverse of hyper conciousness");
    }
}
