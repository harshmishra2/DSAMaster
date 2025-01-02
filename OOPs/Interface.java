
interface Shapes{
    double calculateArea();
}

class Rectangle implements Shapes{
    double length;
    double width;

    Rectangle(double len, double wid){
        this.length = len;
        this.width = wid;
    }

    public double calculateArea(){
        return length*width;
    }
}

class Circle implements Shapes{
    double radius;

    Circle(double radius){
        this.radius = radius;
    }

    public double calculateArea(){
        return radius*radius* Math.PI;
    }
}



public class Interface{
    public static void main(String [] args){
        Rectangle rec = new Rectangle(4.0, 4.0);
        Circle cir = new Circle(6.0);

        System.out.println("The rectangle which is actually a square has an area of "+ rec.calculateArea());
        System.out.println("The circle has an area of "+ cir.calculateArea());
    }
}
