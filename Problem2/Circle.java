public class Circle extends Shape{

    protected double radius;

    private String name;

    public Circle(double radius, String name){
        this.radius = radius;
        this.name = name;
    }

    public Circle(){
        this.radius = 0.0;
        this.name = "Circle";
    }

    public double getRadius(){
        return this.radius;
    }

    public String getName(){
        return this.name;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void scale(double factor){
        this.radius *= factor;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return getName() + " " + "[Perimeter = " + getPerimeter() + " Area = " + getArea() + "]";
    }
}
