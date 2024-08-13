public class EquilateralTriangle extends Shape{

    protected double side;

    private String name;

    public EquilateralTriangle(){
        this.side = side;
        this.name = name;
    }

    public EquilateralTriangle(double side, String name){
        this.side = 1.0;
        this.name = "Equilateral Triangle";
    }

    public double getSide(){
        return this.side;
    }

    public String getName(){
        return this.name;
    }

    public void setSide(double side){
        this.side = side;
    }

    public void scale(double factor){
        this.side *= factor;
    }

    public double getPerimeter(){
        return side * 3;
    }

    public double getS(){
        return (side * 3)/2;
    }

    public double getArea(){
        double s = getS();
        return Math.sqrt(s * (s - side) * (s - side) * (s - side));
    }

    public String toString(){
        return getName() + " " + "[Perimeter = " + getPerimeter() + " Area = " + getArea() + "]";
    }
}
