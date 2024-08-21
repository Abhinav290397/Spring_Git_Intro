package polymorphism2;

public class Drawing {

    //Method overloading - Functions with same name but different no. of arguments.
    public void draw(){
        System.out.println("No input, its a circle");
    }
    public void draw(int point){
        System.out.println("Its a dot");
    }
    public void draw(int point1,int point2){
        System.out.println("Its a line");
    }
    public void draw(int point1,int point2,int point3){
        System.out.println("Its a triangle");
    }
    public void draw(int point1,int point2,int point3,int point4){
        System.out.println("Its a square");
    }
}
