abstract class Shape{
    String color;
    public Shape(String color){
        this.color=color;
    }
    abstract double area();

    public String getColor(){
        return color;

    }
}


class Circle extends Shape{
    float radius;

    public Circle(String color, float radius){
        super(color);
        this.radius=radius;
    }

    @Override
    double area(){
        return Math.PI * radius *radius;
    }
}

class Rectangle extends Shape{
    float weight,width;

    public Rectangle(String color, float weight,float width){
        super(color);
        this.width=width;
        this.weight=weight;
    }

    @Override
    double area(){
        return weight*width;
    }
}


public class Abs{
    public static void main(String[] args){
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle ("Blue",4,5);

        System.out.println("circle area:" + circle.area());
        System.out.println("rectangle area:" + rectangle.area());
        System.out.println("circle color:" + circle.getColor());
    }
}