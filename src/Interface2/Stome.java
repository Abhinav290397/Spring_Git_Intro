package Interface2;

//implements is the keyword which implements the abstract method of interface in child class.
public class Stome implements Demo{
    @Override
    public void print() {
        System.out.println("value of a is - " + a);
    }
}
