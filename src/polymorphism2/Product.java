package polymorphism2;

public class Product {
    public int sum(int x,int y){
        System.out.println(x+y);
        return x+y;
    }
    public int sum(int x,int y,int z){
        System.out.println(x+y+z);
        return x+y+z;
    }
    public double sum(double x,double y){
        System.out.println(x+y);
        return x+y;
    }
}
