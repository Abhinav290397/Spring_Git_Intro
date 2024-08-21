package polymorphism1;

import polymorphism2.Drawing;
import polymorphism2.Product;

//Polymorphism - It means a method
public class Main {
    public static void main(String[] args) {
        Drawing d1 = new Drawing();
        d1.draw();
        d1.draw(7);
        d1.draw(5,8);
        d1.draw(11,15,29);
        d1.draw(1,4,3,9);

        Product p = new Product();
        p.sum(2,3);
        p.sum(2,3,1);
        p.sum(26.11,9.11);
    }
}
