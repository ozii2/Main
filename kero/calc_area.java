class Shape{
    public double calculate_area(){
        return 0;
    }
}

class Rectangle extends Shape{
    private double width,height;
    public Rectangle(double width,double height){
        this.height=height;
        this.width=width;
    }
    @Override
    public double calculate_area(){
        return width * height;
    }
}

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double calculate_area(){
        return 3.14 * radius * radius;
    }
}

public class calc_area{
    public static void main(String[] args) {
        Shape rectangle= new Rectangle(2,3);
        Shape circle = new Circle(3);

        System.out.println(rectangle.calculate_area());
        System.out.println(circle.calculate_area());
    }
}
