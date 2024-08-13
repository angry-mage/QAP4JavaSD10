public abstract class Shape implements Scalable {

    public abstract double getArea();

    public abstract double getPerimeter();

    public String toString(){
        return "Shape [Perimeter = " + getPerimeter() + " Area = " + getArea() + "]";
    }

    public abstract void scale(double factor);
}
