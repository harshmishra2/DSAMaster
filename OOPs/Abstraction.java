abstract class Shape{

    String color;

    //abstract methods of the shape class
    abstract double area();
    public abstract String toString();

    //concrete method of the shape class
    public String color(){
        return color;
    }

    //constructor
    public Shape(String color){
        this.color = color;
        System.out.println("inside abstract class constructor.");
    }
}

class Square extends Shape{
    int side;
    Square(int side, String color){
        super(color);
        System.out.println("inside square's constructor.");
        this.side= side;
    }
    @Override
    public double area(){
        return side*side;
    }

    @Override
    public String toString(){
        return "This is the square class, area of the square is " + this.area() + " and color is "+ this.color;
    }
}

class Circle extends Shape{
    int radius;
    Circle(int radius, String color){
        super(color);
        this.radius= radius;
        System.out.println("Inside the circle constructor.");
    }
    @Override
    public double area(){
        return Math.PI*radius*radius;
    }
    @Override
    public String toString(){
        return "The area of the circle is "+ this.area() + " and color is "+ this.color;
    }
}


public class Abstraction{
    public static void main(String [] args){

        Shape s1 = new Square(20, "blue");
        Shape s2 = new Circle(15, "red");

        System.out.println(s1.toString());
        System.out.println(s2.toString());

    }
}